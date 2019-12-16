package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.UserInfo;

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
public interface UserInfoDao {
	
	public UserInfo login(UserInfo userInfo);
	
	public List<UserInfo> findAllUserInfo(Map<String,Object> map);

	public int saveUserInfo(UserInfo userInfo);
	
	public int findUserInfoByUserName(String user_name);
	
	public int updateUserInfo(UserInfo userInfo);
	
	public int findAllUserInfoConut(Map<String,Object> map);
	
	public int deleteUserInfo(int user_id);
	
    public  List<UserInfo> findAllUserInfoByRole(Map<String,Object> map);
    
    public String findReceiveUserName(Integer user_id);
    
    public  List<UserInfo> findUserInfoByRole();
}
