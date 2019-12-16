package com.byzx.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.MenuInfoDao;
import com.byzx.model.MenuInfo;
import com.byzx.service.MenuInfoService;
import com.byzx.util.DateUtil;
import com.byzx.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: MenuInfoServiceImpl.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月20日下午5:16:13
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月20日下午5:16:13</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class MenuInfoServiceImpl implements MenuInfoService{

	@Autowired
	private MenuInfoDao menuInfoDao;
	
	
   @Override
	public JSONArray findMenusByMenuIds(String parentId, List<Integer> menuIdList) {
		JSONArray jsonArray=getMenusByMenuIds(parentId,menuIdList);
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject jsonObject=jsonArray.getJSONObject(i);
			if("open".equals(jsonObject.getString("state"))) {
				continue;
			}else {
				jsonObject.put("children",findMenusByMenuIds(jsonObject.getInt("id")+"",menuIdList));
			}
		}
		return jsonArray;
	}
	
	public JSONArray getMenusByMenuIds(String parentId,List<Integer> menuIdList) {
		JSONArray jsonArray=new JSONArray();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("parentId", parentId);
		map.put("menuIdList", menuIdList);
		List<MenuInfo> menuList=menuInfoDao.findMenusByMenuIds(map);
		for(int i=0;i<menuList.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("id", menuList.get(i).getMenu_id());
			jsonObject.put("text", menuList.get(i).getMenu_name());
			jsonObject.put("state", menuList.get(i).getMenu_state());
			jsonObject.put("iconCls", menuList.get(i).getMenu_iconCls());
			JSONObject jsonObject1=new JSONObject();
			jsonObject1.put("path", menuList.get(i).getMenu_path());
			jsonObject.put("attributes", jsonObject1);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}
	
	

	@Override
	public JSONArray findAllMenu(String parentId, String menu_ids) {
		JSONArray jsonArray=findMenusByMenuIds(parentId,menu_ids);
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject jsonObject=jsonArray.getJSONObject(i);
			if("open".equals(jsonObject.getString("state"))) {
				continue;
			}else {
				jsonObject.put("children",findAllMenu(jsonObject.getInt("id")+"",menu_ids));
			}
		}
		return jsonArray;
	}
	
	public JSONArray findMenusByMenuIds(String parentId,String menu_ids) {
		JSONArray jsonArray=new JSONArray();
		List<MenuInfo> menuList=menuInfoDao.getMenusByMenuIds(parentId);
		for(int i=0;i<menuList.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("id", menuList.get(i).getMenu_id());
			jsonObject.put("text", menuList.get(i).getMenu_name());
			jsonObject.put("state", menuList.get(i).getMenu_state());
			jsonObject.put("iconCls", menuList.get(i).getMenu_iconCls());
			if(StringUtil.existStrArr(menuList.get(i).getMenu_id()+"", menu_ids.split(","))) {
				jsonObject.put("checked", true);
			}
			JSONObject jsonObject1=new JSONObject();
			jsonObject1.put("path", menuList.get(i).getMenu_path());
			jsonObject.put("attributes", jsonObject1);
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public JSONArray findAllMenuInfo(String parentId) {
		JSONArray jsonArray=findAllMenuInfos(parentId);
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject jsonObject=jsonArray.getJSONObject(i);
			if("open".equals(jsonObject.getString("state"))) {
				continue;
			}else {
				jsonObject.put("children",findAllMenuInfo(jsonObject.getInt("menu_id")+""));
			}
		}
		return jsonArray;
	}
	
	public JSONArray findAllMenuInfos(String parentId) {
		JSONArray jsonArray=new JSONArray();
		List<MenuInfo> menuList=menuInfoDao.getMenusByMenuIds(parentId);
		for(int i=0;i<menuList.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("menu_id", menuList.get(i).getMenu_id());
			jsonObject.put("menu_name", menuList.get(i).getMenu_name());
			jsonObject.put("state", menuList.get(i).getMenu_state());
			jsonObject.put("menu_iconCls", menuList.get(i).getMenu_iconCls());
			jsonObject.put("menu_path", menuList.get(i).getMenu_path());
			jsonObject.put("createtime", menuList.get(i).getCreatetime());
			jsonObject.put("remark", menuList.get(i).getRemark());
			jsonObject.put("parentId", menuList.get(i).getParentId());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int saveMenuInfo(MenuInfo menuInfo) {
		menuInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		menuInfo.setDelflag(0);
		menuInfo.setMenu_state("open");
		int parentId=menuInfo.getParentId();
		menuInfoDao.updateMenuInfoByParentId(parentId);
		return menuInfoDao.saveMenuInfo(menuInfo);
	}

	@Override
	public int updateMenuInfo(MenuInfo menuInfo) {
		if(menuInfo.getMenu_state()=="closed") {
			menuInfo.setMenu_path(null);
		}
		return menuInfoDao.updateMenuInfo(menuInfo);
	}

	@Override
	public int deleteMenuInfo(Integer menu_id,Integer parentId) {
		int findChildren=menuInfoDao.findNodeChildrenMenuId(parentId);
		if(findChildren==1) {
			menuInfoDao.updateMenuInfoOpenByParentId(parentId);
		}
		return menuInfoDao.deleteMenuInfo(menu_id);
	}

	
}
