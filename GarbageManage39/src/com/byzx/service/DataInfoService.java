package com.byzx.service;

import java.util.Map;

import com.byzx.model.DataInfo;

import net.sf.json.JSONArray;

/**@文件名: DataInfoService.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月26日上午10:02:49
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月26日上午10:02:49</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface DataInfoService {

	public JSONArray findAllDataInfo(Map<String,Object> map);
	
	public int findAllDataInfoCount(Map<String,Object> map);
	
	public int saveDataInfo(DataInfo dataInfo);
	
	public int updateDataInfo(DataInfo dataInfo);
	
	public int deleteDataInfo(Integer data_id);
}
