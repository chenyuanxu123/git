package com.byzx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.byzx.model.MenuInfo;
import com.byzx.model.UserInfo;
import com.byzx.service.MenuInfoService;
import com.byzx.service.RoleInfoService;
import com.byzx.util.ResponseUtil;
import com.byzx.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: MenuInfoController.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月20日下午4:56:35
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月20日下午4:56:35</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("/menuInfo")
public class MenuInfoController {

	@Autowired
	private MenuInfoService menuInfoService;
	
	@Autowired
	private RoleInfoService roleInfoService;
	
	@RequestMapping("/menuList")
	public void menuList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		String parentId="-1";
		HttpSession session=request.getSession();
		UserInfo sessionUser=(UserInfo)session.getAttribute("currentUserInfo");
		String menuIds=roleInfoService.findMenuIdsByRId(sessionUser.getRole_id());
		List<Integer> menuIdList=StringUtil.stringToArry(menuIds);
	
		JSONArray jsonArray=menuInfoService.findMenusByMenuIds(parentId,menuIdList);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("menuList", jsonArray);
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/findAllMenu")
	public void findAllMenu(String menu_ids,HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		String parentId="-1";
		JSONArray jsonArray=menuInfoService.findAllMenu(parentId,menu_ids);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("menuList", jsonArray);
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/findAllMenuInfo")
	public void findAllMenuInfo(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String parentId="-1";
		JSONArray jsonArray=menuInfoService.findAllMenuInfo(parentId);
		ResponseUtil.write(response, jsonArray);
	}
	
	@RequestMapping("/saveMenuInfo")
	public void saveMenuInfo(MenuInfo menuInfo,HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session=request.getSession();
		UserInfo userInfo=(UserInfo)session.getAttribute("currentUserInfo");
		menuInfo.setOpt_id(userInfo.getUser_id());
		int result=menuInfoService.saveMenuInfo(menuInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg",true);
		}else {
			jsonObject.put("msg",false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/updateMenuInfo")
	public void updateMenuInfo(MenuInfo menuInfo,HttpServletRequest request,HttpServletResponse response)throws Exception{
		HttpSession session=request.getSession();
		UserInfo userInfo=(UserInfo)session.getAttribute("currentUserInfo");
		menuInfo.setOpt_id(userInfo.getUser_id());
		int result=menuInfoService.updateMenuInfo(menuInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg",true);
		}else {
			jsonObject.put("msg",false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/deleteMenuInfo")
	public void deleteMenuInfo(String menu_id,String parentId,HttpServletRequest request,HttpServletResponse response)throws Exception{
		int result=menuInfoService.deleteMenuInfo(Integer.parseInt(menu_id),Integer.parseInt(parentId));
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg",true);
		}else {
			jsonObject.put("msg",false);
		}
		ResponseUtil.write(response, jsonObject);
	}
}








