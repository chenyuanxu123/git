package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.DataDetailInfo;
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
public interface DataDetailInfoDao {

	public List<DataDetailInfo> findDataDetailInfoByDId(Integer data_id);
	
	public int saveDataDetailInfo(DataDetailInfo dataDetailInfo);
	
	public int updateDataDetailInfo(DataDetailInfo dataDetailInfo);
	
	public int deleteDataDetailInfo(Integer dataDetail_id);
	
	public int deleteDataDetailByDId(Integer data_id);
}






