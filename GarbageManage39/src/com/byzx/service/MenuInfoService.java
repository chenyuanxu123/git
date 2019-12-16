package com.byzx.service;

import java.util.List;

import com.byzx.model.MenuInfo;

import net.sf.json.JSONArray;

/**@文件名: MenuInfoService.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月20日下午5:14:16
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月20日下午5:14:16</li> 
 *	 <li>内容: </li>
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
