package com.byzx.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.byzx.model.PageBean;
import com.byzx.model.UserInfo;
import com.byzx.service.UserInfoService;
import com.byzx.util.ResponseUtil;
import com.byzx.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: UserInfoController.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月19日下午4:41:26
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月19日下午4:41:26</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("/login")
	public String login(UserInfo userInfo,HttpServletRequest request) {
		HttpSession session=request.getSession();
		String imageCode=request.getParameter("yzm");
		String sRand=(String)session.getAttribute("sRand");
		UserInfo sessionUserInfo=(UserInfo)session.getAttribute("currentUserInfo");
		UserInfo resultUserInfo=userInfoService.login(userInfo);
		if(sessionUserInfo!=null) {
			return "main";
		}else {
			if(imageCode==null) {
				return "redirect:../login.jsp";
			}else {
				if(!imageCode.equals(sRand)) {
					return "redirect:../login.jsp?error=1&imageCode="+imageCode+"&userName="+userInfo.getUser_name()+"&password="+userInfo.getUser_pwd();
				}else {
					if(resultUserInfo!=null) {
						session.setAttribute("currentUserInfo", resultUserInfo);
						return "main";
					}else {
						return "redirect:../login.jsp?error=2&imageCode="+imageCode+"&userName="+userInfo.getUser_name()+"&password="+userInfo.getUser_pwd();
					}
				}
			}
		}
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session=request.getSession();
		session.removeAttribute("currentUserInfo");
		return "redirect:../login.jsp";
	}
	
	@RequestMapping("/findAllUserInfo")
	public void findAllUserInfo(@RequestParam(value="page",required=false)String page,
								@RequestParam(value="rows",required=false)String rows,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		String seachUserName=request.getParameter("seachUserName");
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		if(StringUtil.isNotEmpty(seachUserName)) {
			map.put("seachUserName", seachUserName);
		}
		map.put("pageBean", pageBean);
		JSONArray jsonArray=userInfoService.findAllUserInfo(map);
		int total=userInfoService.findAllUserInfoConut(map);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rows", jsonArray);
		jsonObject.put("total", total);
		ResponseUtil.write(response, jsonObject);
	}
	
	
	@RequestMapping("/findAllUserInfoByRole")
	public void findAllUserInfoByRole(@RequestParam(value="page",required=false)String page,
								@RequestParam(value="rows",required=false)String rows,
			                 HttpServletRequest request,HttpServletResponse response) throws Exception {
		String seachUserName=request.getParameter("seachUserName");
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		if(StringUtil.isNotEmpty(seachUserName)) {
			map.put("seachUserName", seachUserName);
		}
		map.put("pageBean", pageBean);
		JSONArray jsonArray=userInfoService.findAllUserInfoByRole(map);
		int total=userInfoService.findAllUserInfoByRoleConut(map);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rows", jsonArray);
		jsonObject.put("total", total);
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/saveUserInfo")
	public void saveUserInfo(UserInfo userInfo,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=userInfoService.saveUserInfo(userInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
			jsonObject.put("errorMsg", "系统繁忙，请稍候再操作！");
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/findUserInfoByUserName")
	public void findUserInfoByUserName(@RequestParam(value="user_name",required=false)String user_name,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=userInfoService.findUserInfoByUserName(user_name);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/updateUserInfo")
	public void updateUserInfo(UserInfo userInfo,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=userInfoService.updateUserInfo(userInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
			jsonObject.put("errorMsg", "系统繁忙，请稍候再操作！");
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	
	@RequestMapping("/deleteUserInfo")
	public void deleteUserInfo(String userInfoIds,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=userInfoService.deleteUserInfo(userInfoIds);
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
	
	
	@RequestMapping("/findUserInfoByRole")
	public void findUserInfoByRole(HttpServletRequest request,HttpServletResponse response) throws Exception {
		JSONArray jsonArray=userInfoService.findUserInfoByRole();
		ResponseUtil.write(response, jsonArray);
	}
	
}







