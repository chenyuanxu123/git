package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.RoleInfo;

/**@文件名: RoleInfoDao.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月20日下午5:11:42
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月20日下午5:11:42</li> 
 *	 <li>内容: </li>
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
