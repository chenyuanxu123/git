package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.RecycleLinkmanInfo;

public interface RecycleLinkmanInfoDao {
	
  public List<RecycleLinkmanInfo> findAllRecycleInfoById(Integer recycle_id);
  
  public int saveRecycleLinkmanInfo(Map<String, Object> map);
  
  public int deleteRecycleLinkmanInfoByDId(Integer recycle_id);
  
  public int updateRecycleLinkmanInfo(Map<String, Object> map);
  

  
 
  
  
}
