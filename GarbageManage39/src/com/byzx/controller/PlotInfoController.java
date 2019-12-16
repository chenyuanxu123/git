package com.byzx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.byzx.model.PlotInfo;
import com.byzx.service.PlotInfoService;
import com.byzx.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/plotInfo")
public class PlotInfoController {

	@Autowired
	private PlotInfoService plotInfoService;
	
	@RequestMapping("/findAllPlotScope")
	public void findAllPlotScope(HttpServletRequest request,HttpServletResponse response) throws Exception {
		List<PlotInfo> plotInfo=plotInfoService.findAllPlotScope();
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("plotInfo", plotInfo);
		ResponseUtil.write(response, jsonObject);
	}
	
	

	@RequestMapping("/findAllPlots")
	public void findAllPlots(@RequestParam(value="plot_site",required=false)String plot_site,
							 HttpServletRequest request,
							 HttpServletResponse response) throws Exception {
		JSONObject jsonObject=new JSONObject();
		JSONObject plotInfo=plotInfoService.findAllPlots(plot_site);
		jsonObject.put("plotInfo", plotInfo);
		ResponseUtil.write(response, jsonObject);
	}
	
	
	@RequestMapping("/savePlotInfo")
	public void savePlotInfo(@RequestBody PlotInfo plotInfo,HttpServletRequest request,
			                 HttpServletResponse response) throws Exception{
		/*HttpSession session=request.getSession();当前操作人
		PlotInfo plotInfos=(PlotInfo)session.getAttribute("currentPlotInfo");*/
		int result=plotInfoService.savePlotInfo(plotInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/updatePlotInfo")
	public void updatePlotInfo(@RequestBody PlotInfo plotInfo,HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		int result=plotInfoService.updatePlotInfo(plotInfo);
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
	@RequestMapping("/deletePlotInfo")
	public void deletePlotInfo(@RequestParam(value="plot_id",required=false)String plot_id,
			                   HttpServletRequest request,HttpServletResponse response) throws Exception {
		int result=plotInfoService.deletePlotInfo(Integer.parseInt(plot_id));
		JSONObject jsonObject=new JSONObject();
		if(result>0) {
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		ResponseUtil.write(response, jsonObject);
	}
	
}









