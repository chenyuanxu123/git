package com.byzx.service;

import java.util.Map;

import com.byzx.model.UserInfo;

import net.sf.json.JSONArray;

/**@文件名: UserInfoDao.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月19日下午4:38:44
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月19日下午4:38:44</li> 
 *	 <li>内容: </li>
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
