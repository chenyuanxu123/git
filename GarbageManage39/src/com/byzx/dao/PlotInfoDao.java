package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.DataInfo;
import com.byzx.model.PlotInfo;


/**@�ļ���: RoleInfoDao.java
 * @�๦��˵��: 
 * @����: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @����: 2019��9��20������5:11:42
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: GuoHaiFeng</li> 
 * 	 <li>����: 2019��9��20������5:11:42</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface PlotInfoDao{
	
	 public List<PlotInfo> findAllPlotScope();
	
    public PlotInfo findAllPlots(String plot_site);
	
	public int findAllPlotsCount(Map<String,Object> map);
	
	public int savePlotInfo(PlotInfo plotInfo);
	
	public int getMaxPlotId();
	
	public int updatePlotInfo(PlotInfo plotInfo);
	
	public int deletePlotInfo(Integer plot_id);
}
