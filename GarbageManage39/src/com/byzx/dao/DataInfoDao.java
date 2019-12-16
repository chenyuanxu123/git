package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.DataInfo;

/**@文件名: DataInfoDao.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月26日上午10:08:39
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月26日上午10:08:39</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface DataInfoDao {

	public List<DataInfo> findAllDataInfo(Map<String, Object> map);
	
	public int findAllDataInfoCount(Map<String, Object> map);
	
	public int saveDataInfo(DataInfo dataInfo);
	
	public int getMaxDataId();
	
	public int updateDataInfo(DataInfo dataInfo);
	
	public int deleteDataInfo(Integer data_id);
}






