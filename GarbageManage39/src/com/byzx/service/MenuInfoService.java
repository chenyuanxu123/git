package com.byzx.service;

import java.util.List;

import com.byzx.model.MenuInfo;

import net.sf.json.JSONArray;

/**@�ļ���: MenuInfoService.java
 * @�๦��˵��: 
 * @����: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @����: 2019��9��20������5:14:16
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: GuoHaiFeng</li> 
 * 	 <li>����: 2019��9��20������5:14:16</li> 
 *	 <li>����: </li>
 * </pre>
 */
public interface MenuInfoService {

	public JSONArray findMenusByMenuIds(String parentId,List<Integer> menuIdList);
	
	public JSONArray findAllMenu(String parentId,String menu_ids);
	
	public JSONArray findAllMenuInfo(String parentId);
	
	public int saveMenuInfo(MenuInfo menuInfo);
	
	public int updateMenuInfo(MenuInfo menuInfo);
	
	public int deleteMenuInfo(Integer menu_id,Integer parentId);
}
