package com.byzx.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byzx.dao.UserInfoDao;
import com.byzx.model.UserInfo;
import com.byzx.service.UserInfoService;
import com.byzx.util.DateUtil;
import com.byzx.util.Md5;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**@文件名: UserInfoServiceImpl.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月19日下午4:40:13
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月19日下午4:40:13</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;
	
	@Override
	public UserInfo login(UserInfo userInfo) {
		return userInfoDao.login(userInfo);
	}

	@Override
	public JSONArray findAllUserInfo(Map<String,Object> map) {
		List<UserInfo> userList=userInfoDao.findAllUserInfo(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<userList.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("user_id", userList.get(i).getUser_id());
			jsonObject.put("user_name", userList.get(i).getUser_name());
			jsonObject.put("user_pwd", userList.get(i).getUser_pwd());
			jsonObject.put("user_phone", userList.get(i).getUser_phone());
			jsonObject.put("user_idCard", userList.get(i).getUser_idCard());
			jsonObject.put("user_integral", userList.get(i).getUser_integral());
			jsonObject.put("role_id", userList.get(i).getRole_id());
			jsonObject.put("role_name", userList.get(i).getRole_name());
			jsonObject.put("plot_id", userList.get(i).getPlot_id());
			jsonObject.put("user_site", userList.get(i).getUser_site());
			jsonObject.put("remark", userList.get(i).getRemark());
			jsonObject.put("createtime", userList.get(i).getCreatetime());
				
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int saveUserInfo(UserInfo userInfo) {
		userInfo.setUser_pwd(Md5.MD5(userInfo.getUser_pwd()));
		userInfo.setState(0);
		userInfo.setCreatetime(DateUtil.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss"));
		userInfo.setDelFlag(0);
		return userInfoDao.saveUserInfo(userInfo);
	}

	@Override
	public int findUserInfoByUserName(String user_name) {
		return userInfoDao.findUserInfoByUserName(user_name);
	}

	@Override
	public int updateUserInfo(UserInfo userInfo) {
		userInfo.setUser_pwd(Md5.MD5(userInfo.getUser_pwd()));
		return userInfoDao.updateUserInfo(userInfo);
	}

	@Override
	public int findAllUserInfoConut(Map<String,Object> map) {
		return userInfoDao.findAllUserInfoConut(map);
	}

	@Override
	public int deleteUserInfo(String userInfoIds) {
		int count=0;
		String userIds[]=userInfoIds.split(",");
		for(int i=0;i<userIds.length;i++) {
			int result=userInfoDao.deleteUserInfo(Integer.parseInt(userIds[i]));
			if(result>0) {
				count++;
			}
		}
		return count;
	}

	@Override
	public JSONArray findAllUserInfoByRole(Map<String, Object> map) {
		List<UserInfo> userList=userInfoDao.findAllUserInfoByRole(map);
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<userList.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("user_id", userList.get(i).getUser_id());
			jsonObject.put("user_name", userList.get(i).getUser_name());
			jsonObject.put("user_pwd", userList.get(i).getUser_pwd());
			jsonObject.put("user_phone", userList.get(i).getUser_phone());
			jsonObject.put("user_idCard", userList.get(i).getUser_idCard());
			jsonObject.put("user_integral", userList.get(i).getUser_integral());
			jsonObject.put("role_id", userList.get(i).getRole_id());
			jsonObject.put("role_name", userList.get(i).getRole_name());
			jsonObject.put("plot_id", userList.get(i).getPlot_id());
			jsonObject.put("remark", userList.get(i).getRemark());
	
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

	@Override
	public int findAllUserInfoByRoleConut(Map<String, Object> map) {
		return userInfoDao.findAllUserInfoConut(map);
	}

	@Override
	public JSONArray findUserInfoByRole() {
		List<UserInfo> userList=userInfoDao.findUserInfoByRole();
		JSONArray jsonArray=new JSONArray();
		for(int i=0;i<userList.size();i++) {
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("user_id", userList.get(i).getUser_id());
			jsonObject.put("user_name", userList.get(i).getUser_name());
			jsonObject.put("role_name", userList.get(i).getRole_name());
			jsonObject.put("plot_id", userList.get(i).getPlot_id());
			jsonArray.add(jsonObject);
		}
		return jsonArray;
	}

}
