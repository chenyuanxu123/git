package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.RecycleInfo;

public interface RecycleInfoDao {
	
	//查找回收站所有信息接口
	public  List<RecycleInfo> findAllRecycleInfo(Map<String, Object> map);
	
	//查找回收站所有信息条数接口
	public int findAllRecycleInfoConut(Map<String, Object> map);
	
	//查找回收站主表新建的一条的id接口
	public int getMaxDataId();
	
	//添加回收站信息接口
	public int saveRecycleInfo(RecycleInfo recycleInfo);
	
	//修改回收站信息接口
	public int updateRecycleInfo(RecycleInfo recycleInfo);
	
	//删除回收站信息接口
	public int deleteRecycleInfo(Integer recycle_id);
	
	//根据id查找回收站名称接口
	public String findRecycleName(Integer recycle_id);
	
	//查找所有回收站名称接口
	public List<RecycleInfo> findRecycleNames();
	
	//查找回收站所有位置信息接口
	public List<String> findRecycleSite();
	
	//根据回收站位置查找回收站所有信息接口
	public RecycleInfo  findRecycleInfoBySite(String recycle_site);
	
	
	
	

}
