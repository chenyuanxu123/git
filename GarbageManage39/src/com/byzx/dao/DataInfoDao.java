package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.DataInfo;

/**@�ļ���: DataInfoDao.java
 * @�๦��˵��: 
 * @����: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @����: 2019��9��26������10:08:39
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: GuoHaiFeng</li> 
 * 	 <li>����: 2019��9��26������10:08:39</li> 
 *	 <li>����: </li>
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






