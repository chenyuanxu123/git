package com.byzx.service;

import java.util.List;
import java.util.Map;

import com.byzx.model.RecycleInfo;
import com.byzx.model.RecycleLinkmanInfo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public interface RecycleInfoService {
	
	
	//查找回收站所有信息业务处理接口
	public JSONArray findAllRecycleInfo(Map<String,Object> map);
	
    //查找回收站所有信息总条数业务处理接口
	public int findAllRecycleInfoConut(Map<String,Object> map);
	
	//新增回收站信息业务处理接口
	public int saveRecycleInfo(RecycleInfo recycleInfo);
	
	//新增回收站信息业务处理接口
	public int saveRecycleLinkmanInfo(Map<String,Object> map);
	
	//修改回收站信息业务处理接口
	public int updateRecycleInfo(RecycleInfo recycleInfo);
	
	//修改回收站子表信息业务处理接口
	public int updateRecycleLinkmanInfo(Map<String,Object> map);
	
	//删除回收站信息业务处理接口
	public int deleteRecycleInfo(String recycleInfoIds);
	
	//查找回收站新增数据的id的业务处理接口
	public int getMaxDataId();
	
	//查找回收站名字业务处理接口
	public JSONArray findRecycleNames(); 
	
	//查找回收站位置业务处理接口
	public List<String>  findRecycleSite();
	
	//通过位置查找回收站信息业务处理接口
	public  JSONObject  findRecycleInfoBySite(String  recycle_site);
	
	//删除回收站信息业务处理接口
	public int deleteRecycleInfo2(Integer recycle_id);
	
	

}
