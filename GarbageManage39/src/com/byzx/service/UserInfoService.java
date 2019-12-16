package com.byzx.service;

import java.util.Map;

import com.byzx.model.UserInfo;

import net.sf.json.JSONArray;

/**@�ļ���: UserInfoDao.java
 * @�๦��˵��: 
 * @����: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @����: 2019��9��19������4:38:44
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: GuoHaiFeng</li> 
 * 	 <li>����: 2019��9��19������4:38:44</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface UserInfoService {
	
	public UserInfo login(UserInfo userInfo);
	
	public JSONArray findAllUserInfo(Map<String,Object> map);
	
	public int saveUserInfo(UserInfo userInfo);
	
	public int findUserInfoByUserName(String user_name);
	
	public int updateUserInfo(UserInfo userInfo);
	
	public int findAllUserInfoConut(Map<String,Object> map);
	
	public int deleteUserInfo(String userInfoIds);
	
	public  JSONArray  findAllUserInfoByRole(Map<String,Object> map);
	
	public int findAllUserInfoByRoleConut(Map<String,Object> map);
	
	public JSONArray findUserInfoByRole();
	
	

}
