package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.IndentInfo;

public interface IndentInfoDao {
  
	public List<IndentInfo> findAllIndentInfo(Map<String, Object> map);
	
	public int findAllIndentInfoConut(Map<String, Object> map);
	
	public List<IndentInfo> findAllIndentInfoByStatus(Map<String, Object> map);
	
	public int findAllIndentInfoByStatusConut(Map<String, Object> map);
	
	public int updateIndentStatus(IndentInfo  indentInfo);
	
	public List<IndentInfo> findAllIndentType();
	
	public List<IndentInfo> findAllIndentStatus();
	
	public int saveIndentInfo(IndentInfo indentInfo);
}
