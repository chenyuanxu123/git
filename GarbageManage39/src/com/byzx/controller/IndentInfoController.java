package com.byzx.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.byzx.model.IndentInfo;
import com.byzx.model.PageBean;
import com.byzx.model.UserInfo;
import com.byzx.service.IndentInfoService;
import com.byzx.util.ResponseUtil;
import com.byzx.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/indentInfo")
public class IndentInfoController {
   
	@Autowired
	private IndentInfoService indentInfoService;
	
	@RequestMapping("/findAllIndentInfo")
	public void findAllIndentInfo(@RequestParam(value="page",required=false)String page,
			                    @RequestParam(value="rows",required=false)String rows,
			                    String indentType,String indentStatus,
		                        HttpServletRequest request,HttpServletResponse response) throws Exception {
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("indent_type", indentType);
		map.put("indent_status", indentStatus);
		map.put("pageBean", pageBean);
		JSONArray jsonArray=indentInfoService.findAllIndentInfo(map);
		int total=indentInfoService.findAllIndentInfoConut(map);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rows", jsonArray);
		jsonObject.put("total", total);
		ResponseUtil.write(response, jsonObject);
		}
	
	
	@RequestMapping("/findAllIndentInfoByStatus")
	public void findAllIndentInfoByStatus(@RequestParam(value="page",required=false)String page,
			                    @RequestParam(value="rows",required=false)String rows,
		                        HttpServletRequest request,HttpServletResponse response) throws Exception {
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("pageBean", pageBean);
		JSONArray jsonArray=indentInfoService.findAllIndentInfoByStatus(map);
		int total=indentInfoService.findAllIndentInfoByStatusConut(map);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rows", jsonArray);
		jsonObject.put("total", total);
		ResponseUtil.write(response, jsonObject);
		}
	
	
	@RequestMapping("/updateIndentStatus")
	public void updateIndentStatus(String indentIds,String userIds,HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println(userIds);
		int result=indentInfoService.updateIndentStatus(indentIds,userIds);
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
	
	
	
	@RequestMapping("/findAllIndentType")
	public void findAllIndentType(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		JSONArray jsonArray=indentInfoService.findAllIndentType();
		ResponseUtil.write(response, jsonArray);
		}
	
	@RequestMapping("/findAllIndentStatus")
	public void findAllIndentStatus(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		JSONArray jsonArray=indentInfoService.findAllIndentStatus();
		ResponseUtil.write(response, jsonArray);
		}

	
	@RequestMapping("/saveIndentInfo")
	public void saveIndentInfo(IndentInfo indentInfo,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=indentInfoService.saveIndentInfo(indentInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
			jsonObject.put("errorMsg", "系统繁忙，请稍候再操作！");
		}
		ResponseUtil.write(response, jsonObject);
	}

}
