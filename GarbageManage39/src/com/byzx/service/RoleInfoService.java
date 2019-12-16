package com.byzx.service;

import java.util.Map;

import com.byzx.model.RoleInfo;

import net.sf.json.JSONArray;

/**@�ļ���: RoleInfoService.java
 * @�๦��˵��: 
 * @����: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @����: 2019��9��20������5:09:13
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: GuoHaiFeng</li> 
 * 	 <li>����: 2019��9��20������5:09:13</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface RoleInfoService {
	
	public String findMenuIdsByRId(Integer role_id);

	public JSONArray findAllRoles(Map<String,Object> map);
	
	public int findAllRolesCount(Map<String,Object> map);
	
	public int saveRoleInfo(RoleInfo roleInfo);
	
	public int findRoleByRoleName(String role_name);
	
	public int updateRoleInfo(RoleInfo roleInfo);
	
	public int deleteRoleInfo(String roleInfoIds);
	
	public int saveAuth(Map<String,String> map);
	
}
