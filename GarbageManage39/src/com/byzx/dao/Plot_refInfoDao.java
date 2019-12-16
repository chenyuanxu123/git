package com.byzx.dao;

import java.util.List;

import com.byzx.model.Plot_refInfo;


public interface Plot_refInfoDao {

	public List<Plot_refInfo> findPlot_refInfoByDId(Integer plot_id);
	
	public int savePlot_refInfo(Plot_refInfo plot_refInfo);
	
	public int updatePlot_refInfo(Plot_refInfo plot_refInfo);
	
	public int deletePlot_refInfo(Integer plot_ref_id);
	
	public int deletePlot_refByDId(Integer plot_id);
}






