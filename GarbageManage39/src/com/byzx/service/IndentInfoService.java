package com.byzx.service;

import java.util.Map;

import com.byzx.model.IndentInfo;

import net.sf.json.JSONArray;

public interface IndentInfoService {
	
	public JSONArray  findAllIndentInfo(Map<String,Object> map);
	
	public int  findAllIndentInfoConut(Map<String,Object> map);
	
    public JSONArray  findAllIndentInfoByStatus(Map<String,Object> map);
	
	public int  findAllIndentInfoByStatusConut(Map<String,Object> map);
	
	public  int updateIndentStatus(String indentIds,String userIds);
	
	public JSONArray findAllIndentType();
	
	public JSONArray findAllIndentStatus();
	
	public int saveIndentInfo(IndentInfo  indentInfo);
}
