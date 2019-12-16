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
import com.byzx.model.RefuseGarbageInfo;
import com.byzx.model.UserInfo;
import com.byzx.service.RefuseGarbageInfoService;
import com.byzx.util.ResponseUtil;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/refuseGarbageInfo")
public class RefuseGarbageInfoController {
	
	@Autowired
	private RefuseGarbageInfoService  refuseGarbageInfoService;
	
	
	@RequestMapping("/findAllRefuseGarbageInfo")
	public void findAllRefuseGarbageInfo(@RequestParam(value="page",required=false)String page,
								@RequestParam(value="rows",required=false)String rows,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("pageBean", pageBean);
		JSONArray jsonArray=refuseGarbageInfoService.findAllRefuseGarbageInfo(map);
		int total=refuseGarbageInfoService.findAllRefuseGarbageInfoConut(map);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rows", jsonArray);
		jsonObject.put("total", total);
		ResponseUtil.write(response, jsonObject);
	}
	
	
	@RequestMapping("/saveRefuseGarbageInfo")
	public void saveRefuseGarbageInfo(RefuseGarbageInfo refuseGarbageInfo,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=refuseGarbageInfoService.saveRefuseGarbageInfo(refuseGarbageInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
			jsonObject.put("errorMsg", "系统繁忙，请稍候再操作！");
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	
	@RequestMapping("/updateRefuseGarbageInfo")
	public void updateRefuseGarbageInfo(RefuseGarbageInfo refuseGarbageInfo,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=refuseGarbageInfoService.updateRefuseGarbageInfo(refuseGarbageInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
			jsonObject.put("errorMsg", "系统繁忙，请稍候再操作！");
		}
		ResponseUtil.write(response, jsonObject);

	}
	
	
	@RequestMapping("/deleteRefuseGarbageInfo")
	public void deleteUserInfo(String refuseGarbageInfoIds,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=refuseGarbageInfoService.deleteRefuseGarbageInfo(refuseGarbageInfoIds);
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

}
