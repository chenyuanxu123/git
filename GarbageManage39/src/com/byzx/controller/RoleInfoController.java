package com.byzx.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.byzx.model.PageBean;
import com.byzx.model.RoleInfo;
import com.byzx.service.RoleInfoService;
import com.byzx.util.ResponseUtil;
import com.byzx.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: RoleInfoController.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月20日下午4:56:15
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月20日下午4:56:15</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("/roleInfo")
public class RoleInfoController {

	@Autowired
	private RoleInfoService roleInfoService;
	
	@RequestMapping("/findAllRoles")
	public void findAllRoles(String page,String rows,String s_roleName,HttpServletRequest request,HttpServletResponse response) throws Exception {
		Map<String,Object> map=new HashMap<String,Object>();
		if(StringUtil.isNotEmpty(s_roleName)) {
			map.put("s_roleName", s_roleName);
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		map.put("pageBean", pageBean);
		JSONArray jsonArray=roleInfoService.findAllRoles(map);
		int total=roleInfoService.findAllRolesCount(map);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rows", jsonArray);
		jsonObject.put("total", total);
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/saveRoleInfo")
	public void saveRoleInfo(RoleInfo roleInfo,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=roleInfoService.saveRoleInfo(roleInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
			jsonObject.put("errorMsg", "系统繁忙，请稍候再操作！");
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/findRoleByRoleName")
	public void findRoleByRoleName(@RequestParam(value="user_name",required=false)String user_name,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=roleInfoService.findRoleByRoleName(user_name);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/updateRoleInfo")
	public void updateRoleInfo(RoleInfo roleInfo,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=roleInfoService.updateRoleInfo(roleInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
			jsonObject.put("errorMsg", "系统繁忙，请稍候再操作！");
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	
	@RequestMapping("/deleteRoleInfo")
	public void deleteRoleInfo(String roleInfoIds,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=roleInfoService.deleteRoleInfo(roleInfoIds);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
			jsonObject.put("count", result);
		}else {
			jsonObject.put("msg", false);
			jsonObject.put("errorMsg", "系统繁忙，请稍候再操作！");
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/saveAuth")
	public void saveAuth(String role_id,String nodeString,HttpServletRequest request,HttpServletResponse response) throws Exception {
		Map<String,String> map=new HashMap<String,String>();
		map.put("role_id", role_id);
		map.put("node", nodeString);
		int result=roleInfoService.saveAuth(map);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
}









