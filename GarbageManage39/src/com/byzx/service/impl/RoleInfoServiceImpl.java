package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.RoleInfoDao;
import com.byzx.model.RoleInfo;
import com.byzx.service.RoleInfoService;
import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: RoleInfoServiceImpl.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月20日下午5:10:44
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月20日下午5:10:44</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService {

	@Autowired
	private RoleInfoDao roleInfoDao;
	
	@Override
	public String findMenuIdsByRId(Integer role_id) {
		return roleInfoDao.findMenuIdsByRId(role_id);
	}

	@Override
	public JSONArray findAllRoles(Map<String, Object> map) {
		List<RoleInfo> roleList=roleInfoDao.findAllRoles(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<roleList.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("role_id", roleList.get(i).getRole_id());
			jsonObject.put("role_name", roleList.get(i).getRole_name());
			jsonObject.put("menu_ids", roleList.get(i).getMenu_ids());
			jsonObject.put("createtime", roleList.get(i).getCreatetime());
			jsonObject.put("remark", roleList.get(i).getRemark());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int findAllRolesCount(Map<String, Object> map) {
		return roleInfoDao.findAllRolesCount(map);
	}

	@Override
	public int saveRoleInfo(RoleInfo roleInfo) {
		roleInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		roleInfo.setDelflag(0);
		roleInfo.setState(0);
		return roleInfoDao.saveRoleInfo(roleInfo);
	}

	@Override
	public int findRoleByRoleName(String role_name) {
		return roleInfoDao.findRoleByRoleName(role_name);
	}

	@Override
	public int updateRoleInfo(RoleInfo roleInfo) {
		return roleInfoDao.updateRoleInfo(roleInfo);
	}

	@Override
	public int deleteRoleInfo(String roleInfoIds) {
		int count=0;
		String roleIds[]=roleInfoIds.split(",");
		for(int i=0;i<roleIds.length;i++) {
			int result=roleInfoDao.deleteRoleInfo(Integer.parseInt(roleIds[i]));
			if(result>0) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int saveAuth(Map<String, String> map) {
		return roleInfoDao.saveAuth(map);
	}
}
