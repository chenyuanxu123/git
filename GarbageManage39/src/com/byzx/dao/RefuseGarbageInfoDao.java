package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.RefuseGarbageInfo;

public interface RefuseGarbageInfoDao {
	
	public List<RefuseGarbageInfo>  findAllRefuseGarbageInfo(Map<String,Object> map);
	
	public int findAllRefuseGarbageInfoConut(Map<String,Object> map);
	
	public int saveRefuseGarbageInfo(RefuseGarbageInfo  refuseGarbageInfo);
	
	public int updateRefuseGarbageInfo(RefuseGarbageInfo  refuseGarbageInfo);
	
	public int deleteRefuseGarbageInfo(Integer refuse_id);
	

}
