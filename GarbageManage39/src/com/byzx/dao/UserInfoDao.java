package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.UserInfo;

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
