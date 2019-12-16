package com.byzx.service;

import java.util.Map;

import com.byzx.model.RefuseGarbageInfo;

import net.sf.json.JSONArray;

public interface RefuseGarbageInfoService {
	
	public JSONArray  findAllRefuseGarbageInfo(Map<String,Object> map);
	
	public int findAllRefuseGarbageInfoConut(Map<String,Object> map);
	
	public int saveRefuseGarbageInfo(RefuseGarbageInfo refuseGarbageInfo);
	
	public int updateRefuseGarbageInfo(RefuseGarbageInfo refuseGarbageInfo);
	
	public int deleteRefuseGarbageInfo(String refuseGarbageInfoIds);

}
