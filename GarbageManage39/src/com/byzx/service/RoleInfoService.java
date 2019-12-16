package com.byzx.service;

import java.util.Map;

import com.byzx.model.RoleInfo;

import net.sf.json.JSONArray;

/**@文件名: RoleInfoService.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月20日下午5:09:13
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月20日下午5:09:13</li> 
 *	 <li>内容: </li>
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
