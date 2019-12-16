 package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.DataDetailInfoDao;
import com.byzx.dao.DataInfoDao;
import com.byzx.model.DataDetailInfo;
import com.byzx.model.DataInfo;
import com.byzx.service.DataInfoService;
import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: DataInfoServiceImpl.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月26日上午10:04:12
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月26日上午10:04:12</li> 
 *	 <li>内容: </li>
 * </pre>
 */

@Service
public class DataInfoServiceImpl implements DataInfoService {

	@Autowired
	private DataInfoDao dataInfoDao;
	
	@Autowired
	private DataDetailInfoDao dataDetailInfoDao;
	
	@Override
	public JSONArray findAllDataInfo(Map<String, Object> map) {
		List<DataInfo> dataList=dataInfoDao.findAllDataInfo(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<dataList.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("data_id", dataList.get(i).getData_id());
			jsonObject.put("data_name", dataList.get(i).getData_name());
			jsonObject.put("createTime", dataList.get(i).getCreateTime());
			jsonObject.put("remark", dataList.get(i).getRemark());
			
			List<DataDetailInfo> detailList=dataList.get(i).getDataDetailInfo();
			JSONArray detailArray=new JSONArray();
			for(int j=0;j<detailList.size();j++) {
				JSONObject detailObject=new JSONObject();
				detailObject.put("dataDetail_id", detailList.get(j).getDataDetail_id());
				detailObject.put("dataDetail_name", detailList.get(j).getDataDetail_name());
				detailObject.put("createTime", detailList.get(j).getCreateTime());
				detailObject.put("remark", detailList.get(j).getRemark());
				detailArray.add(detailObject);
			}
			jsonObject.put("dataDetailInfo", detailArray);
			
			jsonArray.add(jsonObject);
		}
		
		return jsonArray;
	}

	@Override
	public int findAllDataInfoCount(Map<String, Object> map) {
		return dataInfoDao.findAllDataInfoCount(map);
	}

	@Override
	public int saveDataInfo(DataInfo dataInfo) {
		dataInfo.setCreateTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		dataInfo.setDelflag(0);
		dataInfo.setState(0);
		int dataResult=dataInfoDao.saveDataInfo(dataInfo);
		int maxDataId=dataInfoDao.getMaxDataId();
		List<DataDetailInfo> dataDetailList=dataInfo.getDataDetailInfo();
		for(int i=0;i<dataDetailList.size();i++) {
			DataDetailInfo dataDetailInfo=dataDetailList.get(i);
			dataDetailInfo.setCreateTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
			dataDetailInfo.setData_id(maxDataId);
			dataDetailInfo.setDelflag(0);
			dataDetailInfo.setState(0);
			dataDetailInfo.setOpt_id(dataInfo.getOpt_id());
			dataDetailInfoDao.saveDataDetailInfo(dataDetailInfo);
		}
		return dataResult;
	}

	@Override
	public int updateDataInfo(DataInfo dataInfo) {
		int result=dataInfoDao.updateDataInfo(dataInfo);
		List<DataDetailInfo> oldData=dataDetailInfoDao.findDataDetailInfoByDId(dataInfo.getData_id());
		List<DataDetailInfo> newData=dataInfo.getDataDetailInfo();
		
		if(oldData!=null) {
			for(DataDetailInfo oldObject:oldData) {
				boolean isDelete=true;
				if(newData!=null) {
					for(DataDetailInfo newObject:newData) {
						if(newObject.getDataDetail_id()!=null&&newObject.getDataDetail_id().equals(oldObject.getDataDetail_id())) {
							isDelete=false;
						}
					}
				}
				if(isDelete) {
					dataDetailInfoDao.deleteDataDetailInfo(oldObject.getDataDetail_id());
				}
			}
		}
		
		if(newData!=null) {
			for(DataDetailInfo newObject1:newData) {
				if(newObject1.getDataDetail_id()==null) {
					newObject1.setCreateTime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
					newObject1.setData_id(dataInfo.getData_id());
					newObject1.setDelflag(0);
					newObject1.setState(0);
					dataDetailInfoDao.saveDataDetailInfo(newObject1);
				}else {
					dataDetailInfoDao.updateDataDetailInfo(newObject1);
				}
			}
		}
		return result;
	}

	@Override
	public int deleteDataInfo(Integer data_id) {
		int resultDetail=dataDetailInfoDao.deleteDataDetailByDId(data_id);
		int result=0;
		if(resultDetail>0) {
			result=dataInfoDao.deleteDataInfo(data_id);
		}
		return result;
	}

}
