package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.RoleInfo;

/**@�ļ���: RoleInfoDao.java
 * @�๦��˵��: 
 * @����: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @����: 2019��9��20������5:11:42
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: GuoHaiFeng</li> 
 * 	 <li>����: 2019��9��20������5:11:42</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface RoleInfoDao {

	public String findMenuIdsByRId(Integer role_id);

	public List<RoleInfo> findAllRoles(Map<String,Object> map);
	
	public int findAllRolesCount(Map<String,Object> map);
	
	public int saveRoleInfo(RoleInfo roleInfo);
	
	public int findRoleByRoleName(String role_name);
	
	public int updateRoleInfo(RoleInfo roleInfo);
	
	public int deleteRoleInfo(int role_id);
	
	public int saveAuth(Map<String, String> map);
}
