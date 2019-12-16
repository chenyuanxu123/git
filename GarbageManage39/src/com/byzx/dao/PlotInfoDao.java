package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.DataInfo;
import com.byzx.model.PlotInfo;


/**@文件名: RoleInfoDao.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月20日下午5:11:42
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月20日下午5:11:42</li> 
 *	 <li>内容: </li>
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
