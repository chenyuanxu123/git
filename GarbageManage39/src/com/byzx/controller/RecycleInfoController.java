package com.byzx.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.byzx.model.DataInfo;
import com.byzx.model.PageBean;
import com.byzx.model.PlotInfo;
import com.byzx.model.RecycleInfo;
import com.byzx.model.RecycleLinkmanInfo;
import com.byzx.model.UserInfo;
import com.byzx.service.RecycleInfoService;
import com.byzx.util.ResponseUtil;
import com.byzx.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/recycleInfo")
public class RecycleInfoController {

	
	@Autowired
	private RecycleInfoService recycleInfoService;
	
	
	//查询出回收站所有信息
	@RequestMapping("/findAllRecycleInfo")
	public void findAllRecycleInfo(@RequestParam(value="page",required=false)String page,
			                    @RequestParam(value="rows",required=false)String rows,
                                HttpServletRequest request,HttpServletResponse response) throws Exception {
		String seachByName=request.getParameter("seachByName");
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		if(StringUtil.isNotEmpty(seachByName)) {
		map.put("seachByName", seachByName);
		}
		map.put("pageBean", pageBean);
		JSONArray jsonArray=recycleInfoService.findAllRecycleInfo(map);
		int total=recycleInfoService.findAllRecycleInfoConut(map);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rows", jsonArray);
		jsonObject.put("total", total);
		ResponseUtil.write(response, jsonObject);
		}
	
	 //通过在地图上获取的回收站位置查询回收站信息
	@RequestMapping("/findRecycleInfoBySite")
	public void findRecycleInfoBySite(String recycle_site ,HttpServletRequest request,HttpServletResponse response) throws Exception {
		JSONObject jsonObject=new JSONObject();
		JSONObject recycleInfo=recycleInfoService.findRecycleInfoBySite(recycle_site);
		jsonObject.put("recycleInfo", recycleInfo);
		ResponseUtil.write(response, jsonObject);
		}
	 
	//查询回收站的名字
	@RequestMapping("/findRecycleNames")
	public void findRecycleNames( HttpServletRequest request,HttpServletResponse response) throws Exception {
		JSONArray jsonArray=recycleInfoService.findRecycleNames();
		ResponseUtil.write(response, jsonArray);
	}
	
   //添加回收站信息
	@RequestMapping("/saveRecycleInfo")
	public void saveRecycleInfo(RecycleInfo recycleInfo,String user_id,HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		int result=recycleInfoService.saveRecycleInfo(recycleInfo);
		int maxId=recycleInfoService.getMaxDataId();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("maxId", maxId);
		map.put("user_id", user_id);
		int result2=recycleInfoService.saveRecycleLinkmanInfo(map);
		JSONObject jsonObject=new JSONObject();
		if(result>0&&result2>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
			jsonObject.put("errorMsg", "系统繁忙，请稍候再操作！");
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	//修改回收站信息控制层
	@RequestMapping("/updateRecycleInfo")
	public void updateRecycleInfo(RecycleInfo recycleInfo,String user_id,String recycle_linkman_id,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		int result=recycleInfoService.updateRecycleInfo(recycleInfo);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("recycle_id", recycleInfo.getRecycle_id());
		map.put("user_id", user_id);
		map.put("recycle_linkman_id", recycle_linkman_id);
		int result2=recycleInfoService.updateRecycleLinkmanInfo(map);
		JSONObject jsonObject=new JSONObject();
		if(result>0&&result2>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	//删除回收站信息控制层
	@RequestMapping("/deleteRecycleInfo")
	public void deleteRecycleInfo(String recycleInfoIds,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=recycleInfoService.deleteRecycleInfo(recycleInfoIds);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
			jsonObject.put("count", result);
		}else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	//查找回收站的所有位置信息控制层
	@RequestMapping("/findRecycleSite")
	public void findRecycleSite(HttpServletRequest request,HttpServletResponse response) throws Exception {
		List<String> recycleSite=recycleInfoService.findRecycleSite();
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("recycleSite", recycleSite);
		ResponseUtil.write(response, jsonObject);
	}
	
	
	//地图删除回收站的控制层
	@RequestMapping("/deleteRecycleInfo2")
	public void deleteRecycleInfo2(String recycle_id,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=recycleInfoService.deleteRecycleInfo2(Integer.parseInt(recycle_id));
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
			jsonObject.put("count", result);
		}else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
}
