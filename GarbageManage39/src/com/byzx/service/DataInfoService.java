package com.byzx.service;

import java.util.Map;

import com.byzx.model.DataInfo;

import net.sf.json.JSONArray;

/**@�ļ���: DataInfoService.java
 * @�๦��˵��: 
 * @����: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @����: 2019��9��26������10:02:49
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: GuoHaiFeng</li> 
 * 	 <li>����: 2019��9��26������10:02:49</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface DataInfoService {

	public JSONArray findAllDataInfo(Map<String,Object> map);
	
	public int findAllDataInfoCount(Map<String,Object> map);
	
	public int saveDataInfo(DataInfo dataInfo);
	
	public int updateDataInfo(DataInfo dataInfo);
	
	public int deleteDataInfo(Integer data_id);
}
