package com.byzx.service;

import java.util.List;
import java.util.Map;

import com.byzx.model.PlotInfo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public interface PlotInfoService {
	
	public List<PlotInfo> findAllPlotScope();
	
	public JSONObject findAllPlots(String plot_site);
	
	public int findAllPlotsCount(Map<String,Object> map);
	
	public int savePlotInfo(PlotInfo plotInfo);
	
	public int updatePlotInfo(PlotInfo plotInfo);
	
    public int deletePlotInfo(Integer plot_id);
	
}
