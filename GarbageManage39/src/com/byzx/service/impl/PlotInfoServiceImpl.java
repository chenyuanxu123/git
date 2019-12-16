package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.PlotInfoDao;
import com.byzx.dao.Plot_refInfoDao;
import com.byzx.model.PlotInfo;
import com.byzx.model.Plot_refInfo;
import com.byzx.service.PlotInfoService;
import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: RoleInfoServiceImpl.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月20日下午5:10:44
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月20日下午5:10:44</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class PlotInfoServiceImpl implements PlotInfoService {

	@Autowired
	private PlotInfoDao plotInfoDao;
	
	@Autowired
	private Plot_refInfoDao  plot_refInfoDao;
	
	@Override
	public JSONObject findAllPlots(String plot_site) {
		PlotInfo plotInfo=plotInfoDao.findAllPlots(plot_site);
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("plot_id", plotInfo.getPlot_id());
		jsonObject.put("plot_name", plotInfo.getPlot_name());
		jsonObject.put("plot_site", plotInfo.getPlot_site());
		jsonObject.put("plot_scope", plotInfo.getPlot_scope());
		jsonObject.put("plot_district", plotInfo.getPlot_district());
		/*jsonObject.put("recycle_id", plotList.get(i).getRecycle_id());
		jsonObject.put("recycle_name", plotList.get(i).getRecycle_name());*/
		jsonObject.put("createtime",plotInfo.getCreatetime());
		jsonObject.put("remark", plotInfo.getRemark());
		
		List<Plot_refInfo> plot_refList=plotInfo.getPlot_refInfo();
		JSONArray jsonArray1=new JSONArray();
		for(int j=0;j<plot_refList.size();j++) {
			JSONObject jsonObject1=new JSONObject();
			jsonObject1.put("buliding_num", plot_refList.get(j).getBuliding_num());
			jsonObject1.put("state", plot_refList.get(j).getState());
			jsonObject1.put("createtime", plot_refList.get(j).getCreatetime());
			jsonObject1.put("remark", plot_refList.get(j).getRemark());
			jsonArray1.add(jsonObject1);
		}
		jsonObject.put("plot_refInfo", jsonArray1);
		return jsonObject;
	}

	@Override
	public int findAllPlotsCount(Map<String, Object> map) {
		return plotInfoDao.findAllPlotsCount(map);
	}

	@Override
	public int savePlotInfo(PlotInfo plotInfo) {
		plotInfo.setState(0);
		plotInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		plotInfo.setDelflag(0);
		int plotResult=plotInfoDao.savePlotInfo(plotInfo);
		int maxPlotId=plotInfoDao.getMaxPlotId();
		
		List<Plot_refInfo> plot_refList=plotInfo.getPlot_refInfo();
		for(int i=0;i<plot_refList.size();i++) {
			Plot_refInfo plot_refInfo=plot_refList.get(i);
			plot_refInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
			plot_refInfo.setPlot_id(maxPlotId);
			plot_refInfo.setDelflag(0);
			plot_refInfo.setState(0);
			plot_refInfoDao.savePlot_refInfo(plot_refInfo);
		}
		return plotResult;
	}

    @Override
	public int updatePlotInfo(PlotInfo plotInfo) {
		int result=plotInfoDao.updatePlotInfo(plotInfo);
		List<Plot_refInfo> oldData=plot_refInfoDao.findPlot_refInfoByDId(plotInfo.getPlot_id());
		List<Plot_refInfo> newData=plotInfo.getPlot_refInfo();
		
		if(oldData!=null) {
			for(Plot_refInfo oldObject:oldData) {
				boolean isDelete=true;
				if(newData!=null) {
					for(Plot_refInfo newObject:newData) {
						if(newObject.getPlot_ref_id()!=null&&newObject.getPlot_ref_id().equals(oldObject.getPlot_ref_id())) {
							isDelete=false;
						}
					}
				}
				if(isDelete) {
					plot_refInfoDao.deletePlot_refInfo(oldObject.getPlot_ref_id());
				}
			}
		}
		
		if(newData!=null) {
			for(Plot_refInfo newObject1:newData) {
				 if(newObject1.getPlot_ref_id()==null) {
					newObject1.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
					newObject1.setPlot_id(plotInfo.getPlot_id());
					newObject1.setDelflag(0);
					newObject1.setState(0);
					plot_refInfoDao.savePlot_refInfo(newObject1);
				 }else {
					plot_refInfoDao.updatePlot_refInfo(newObject1);
				 }
			}
		}
		return result;
	}

	@Override
	public int deletePlotInfo(Integer plot_id) {
		int resultPlot_ref=plot_refInfoDao.deletePlot_refByDId(plot_id);
		int result=0;
		if(resultPlot_ref>0) {
			result=plotInfoDao.deletePlotInfo(plot_id);
		}
		return result;
	}

	@Override
	public List<PlotInfo> findAllPlotScope() {
		List<PlotInfo> plotScope=plotInfoDao.findAllPlotScope();
		return plotScope;
	}
}
