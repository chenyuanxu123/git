package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.RecycleInfoDao;
import com.byzx.dao.RecycleLinkmanInfoDao;
import com.byzx.model.DataDetailInfo;
import com.byzx.model.PlotInfo;
import com.byzx.model.RecycleInfo;
import com.byzx.model.RecycleLinkmanInfo;
import com.byzx.service.RecycleInfoService;

import com.byzx.util.DateUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class RecycleInfoServiceImpl implements RecycleInfoService {
	
	@Autowired
	private RecycleLinkmanInfoDao recycleLinkmanInfoDao;
	
	@Autowired
	private RecycleInfoDao  recycleInfoDao;
	
    
	//查找回收站所有信息业务处理
	@Override
	public JSONArray findAllRecycleInfo(Map<String, Object> map) {
	    List<RecycleInfo> recycleList=recycleInfoDao.findAllRecycleInfo(map);
	    JSONArray jsonArray=new JSONArray();
	    for(int i=0;i<recycleList.size();i++) {
	    JSONObject jsonObject=new JSONObject();
	     jsonObject.put("recycle_id", recycleList.get(i).getRecycle_id());
	     jsonObject.put("recycle_name", recycleList.get(i).getRecycle_name());
	     jsonObject.put("recycle_site",recycleList.get(i).getRecycle_site());
	     jsonObject.put("recycle_iconCls", recycleList.get(i).getRecycle_iconCls());
	     jsonObject.put("recycle_capacity",recycleList.get(i).getRecycle_capacity());
	     jsonObject.put("full_status", recycleList.get(i).getFull_status());
	     
	    RecycleLinkmanInfo recycleLinkmanInfo=recycleList.get(i).getRecycleLinkmanInfo();
		    	 jsonObject.put("recycle_linkman_id", recycleLinkmanInfo.getRecycle_linkman_id());
		    	 jsonObject.put("recycle_id",recycleLinkmanInfo.getRecycle_id());
		    	 jsonObject.put("user_id", recycleLinkmanInfo.getUser_id());
		    	 jsonObject.put("remark",recycleLinkmanInfo.getRemark());
		    	 jsonObject.put("createtime",recycleLinkmanInfo.getCreatetime());
		    	 jsonObject.put("user_name",recycleLinkmanInfo.getUser_name());
		    	
		     
		
	   jsonArray.add(jsonObject);
	   System.out.println(jsonObject);
	    }
		return jsonArray;
	}

	//查找回收站名字业务处理
	@Override
	public JSONArray findRecycleNames() {
		 List<RecycleInfo> recycleList=recycleInfoDao.findRecycleNames();
		    JSONArray jsonArray=new JSONArray();
		    for(int i=0;i<recycleList.size();i++) {
		    	JSONObject jsonObject=new JSONObject();
		    	jsonObject.put("recycle_id", recycleList.get(i).getRecycle_id());
		    	jsonObject.put("recycle_name", recycleList.get(i).getRecycle_name());
		        jsonArray.add(jsonObject);
		     }
		   
		return jsonArray;
	}


	//查找回收站所有信息总条数业务处理
	@Override
	public int findAllRecycleInfoConut(Map<String, Object> map) {
		return recycleInfoDao.findAllRecycleInfoConut(map);
		
	}
	
	//查找回收站新增数据的id的业务处理
	@Override
	public int getMaxDataId() {
		return  recycleInfoDao.getMaxDataId();
		
	}
	
	//新增回收站信息业务处理接口
	@Override
	public int saveRecycleInfo(RecycleInfo recycleInfo) {
		recycleInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		recycleInfo.setDelFlag(0);
		recycleInfo.setState(0);
		int result=recycleInfoDao.saveRecycleInfo(recycleInfo);
		return result;
	}

	//新增回收站信息业务处理接口
	@Override
	public int saveRecycleLinkmanInfo(Map<String, Object> map) {
		
		return recycleLinkmanInfoDao.saveRecycleLinkmanInfo(map);
	}



	//修改回收站信息业务处理接口
	@Override
	public int updateRecycleInfo(RecycleInfo recycleInfo) {
		
		return recycleInfoDao.updateRecycleInfo(recycleInfo);
	}
	
	//修改回收站子表信息业务处理接口
	@Override
	public int updateRecycleLinkmanInfo(Map<String,Object> map) {
		
		return recycleLinkmanInfoDao.updateRecycleLinkmanInfo(map);
	}

	//删除回收站信息业务处理接口
	@Override
	public int deleteRecycleInfo(String recycleInfoIds) {
		
		int count=0;
		String recycleIds[]=recycleInfoIds.split(",");
		for(int i=0;i<recycleIds.length;i++) {
			int result=recycleLinkmanInfoDao.deleteRecycleLinkmanInfoByDId(Integer.parseInt(recycleIds[i]));
			if(result>0) {
			result=recycleInfoDao.deleteRecycleInfo(Integer.parseInt(recycleIds[i]));
				count++;
			}
		}
		
		return count;
	}

	//查找回收站位置业务处理接口
	@Override
	public List<String> findRecycleSite() {
		List<String> recycleSite=recycleInfoDao.findRecycleSite();
		return recycleSite;
	}

	//通过位置查找回收站信息业务处理接口
	@Override
	public JSONObject findRecycleInfoBySite(String recycle_site) {
		 RecycleInfo recycleInfo=recycleInfoDao.findRecycleInfoBySite(recycle_site);
		    JSONObject jsonObject=new JSONObject();
		     jsonObject.put("recycle_id", recycleInfo.getRecycle_id());
		     jsonObject.put("recycle_name", recycleInfo.getRecycle_name());
		     jsonObject.put("recycle_iconCls", recycleInfo.getRecycle_iconCls());
		     jsonObject.put("recycle_site",recycleInfo.getRecycle_site());
		     jsonObject.put("recycle_capacity",recycleInfo.getRecycle_capacity());
		     jsonObject.put("full_status", recycleInfo.getFull_status());
		     
		    RecycleLinkmanInfo recycleLinkmanInfo=recycleInfo.getRecycleLinkmanInfo();
			    	 jsonObject.put("recycle_linkman_id", recycleLinkmanInfo.getRecycle_linkman_id());
			    	 jsonObject.put("recycle_id",recycleLinkmanInfo.getRecycle_id());
			    	 jsonObject.put("user_id", recycleLinkmanInfo.getUser_id());
			    	 jsonObject.put("remark",recycleLinkmanInfo.getRemark());
			    	 jsonObject.put("createtime",recycleLinkmanInfo.getCreatetime());
			    	 jsonObject.put("user_name",recycleLinkmanInfo.getUser_name());
	
			return jsonObject;
	}

	//删除回收站信息业务处理接口
	@Override
	public int deleteRecycleInfo2(Integer recycle_id) {
		int result=recycleLinkmanInfoDao.deleteRecycleLinkmanInfoByDId(recycle_id);
		if(result>0) {
		result=recycleInfoDao.deleteRecycleInfo(recycle_id);
	}
		return result;
		}
	
}
	





	






	

