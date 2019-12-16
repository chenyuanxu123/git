package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.RecycleInfoDao;
import com.byzx.dao.RefuseGarbageInfoDao;
import com.byzx.model.RefuseGarbageInfo;
import com.byzx.model.UserInfo;
import com.byzx.service.RefuseGarbageInfoService;
import com.byzx.util.DateUtil;
import com.byzx.util.Md5;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class RefuseGarbageInfoServiceImpl implements RefuseGarbageInfoService {
	
	@Autowired
	private RefuseGarbageInfoDao  refuseGarbageInfoDao;
	
	@Autowired
	private RecycleInfoDao  recycleInfoDao;

	@Override
	public JSONArray findAllRefuseGarbageInfo(Map<String, Object> map) {
		
		List<RefuseGarbageInfo> refuseList=refuseGarbageInfoDao.findAllRefuseGarbageInfo(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<refuseList.size();i++) {
			String recycle_name=recycleInfoDao.findRecycleName(refuseList.get(i).getRecycle_id());
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("refuse_id", refuseList.get(i).getRefuse_id());
			jsonObject.put("recycle_id", refuseList.get(i).getRecycle_id());
			jsonObject.put("recycle_name", recycle_name);
			jsonObject.put("refuse_weight", refuseList.get(i).getRefuse_weight());
			jsonObject.put("remark", refuseList.get(i).getRemark());
			jsonObject.put("createtime", refuseList.get(i).getCreatetime());	
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	} 

	@Override
	public int findAllRefuseGarbageInfoConut(Map<String, Object> map) {
		
			return refuseGarbageInfoDao.findAllRefuseGarbageInfoConut(map);
		
	}

	@Override
	public int saveRefuseGarbageInfo(RefuseGarbageInfo refuseGarbageInfo) {
		refuseGarbageInfo.setState(0);
		refuseGarbageInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		refuseGarbageInfo.setDelFlag(0);
		return refuseGarbageInfoDao.saveRefuseGarbageInfo(refuseGarbageInfo);
	}

	@Override
	public int updateRefuseGarbageInfo(RefuseGarbageInfo refuseGarbageInfo) {
		
		return refuseGarbageInfoDao.updateRefuseGarbageInfo(refuseGarbageInfo);
	}

	@Override
	public int deleteRefuseGarbageInfo(String refuseGarbageInfoIds) {
		int count=0;
		String refuseIds[]=refuseGarbageInfoIds.split(",");
		for(int i=0;i<refuseIds.length;i++) {
			int result=refuseGarbageInfoDao.deleteRefuseGarbageInfo(Integer.parseInt(refuseIds[i]));
			if(result>0) {
				count++;
			}
		}
		return count;
	}

}
