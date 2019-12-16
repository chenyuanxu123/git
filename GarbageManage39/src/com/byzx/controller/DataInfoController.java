package com.byzx.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.byzx.model.DataInfo;
import com.byzx.model.PageBean;
import com.byzx.model.UserInfo;
import com.byzx.service.DataInfoService;
import com.byzx.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: DataInfoController.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月26日上午9:54:12
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月26日上午9:54:12</li> 
 *	 <li>内容: </li>
 * </pre>
 */

@Controller
@RequestMapping("/dataInfo")
public class DataInfoController {

	@Autowired
	private DataInfoService dataInfoService;
	
	@RequestMapping("/findAllDataInfo")
	public void findAllDataInfo(@RequestParam(value="page",required=false)String page,
								@RequestParam(value="rows",required=false)String rows,
								@RequestParam(value="searchValue",required=false)String searchValue,
								HttpServletRequest request,
								HttpServletResponse response) throws Exception {
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("pageBean", pageBean);
		map.put("searchValue", searchValue);
		JSONArray jsonArray=dataInfoService.findAllDataInfo(map);
		int total=dataInfoService.findAllDataInfoCount(map);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rows", jsonArray);
		jsonObject.put("total", total);
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/saveDataInfo")
	public void saveDataInfo(@RequestBody DataInfo dataInfo,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		HttpSession session=request.getSession();
		UserInfo userInfo=(UserInfo)session.getAttribute("currentUserInfo");
		dataInfo.setOpt_id(userInfo.getUser_id());
		int result=dataInfoService.saveDataInfo(dataInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/updateDataInfo")
	public void updateDataInfo(@RequestBody DataInfo dataInfo,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		int result=dataInfoService.updateDataInfo(dataInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/deleteDataInfo")
	public void deleteDataInfo(@RequestParam(value="data_id",required=false)String data_id,HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=dataInfoService.deleteDataInfo(Integer.parseInt(data_id));
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
}










