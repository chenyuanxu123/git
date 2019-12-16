package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.DataDetailInfo;
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
public interface DataDetailInfoDao {

	public List<DataDetailInfo> findDataDetailInfoByDId(Integer data_id);
	
	public int saveDataDetailInfo(DataDetailInfo dataDetailInfo);
	
	public int updateDataDetailInfo(DataDetailInfo dataDetailInfo);
	
	public int deleteDataDetailInfo(Integer dataDetail_id);
	
	public int deleteDataDetailByDId(Integer data_id);
}






