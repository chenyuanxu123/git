package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.MenuInfo;

/**@文件名: MenuInfoDao.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月20日下午5:22:31
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月20日下午5:22:31</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface MenuInfoDao {

	public List<MenuInfo> findMenusByMenuIds(Map<String,Object> map);
	
	public List<MenuInfo> getMenusByMenuIds(String parentId);
	
	public int updateMenuInfoByParentId(int parentId);
	
	public int updateMenuInfoOpenByParentId(int parentId);
	
	public int saveMenuInfo(MenuInfo menuInfo);
	
	public int updateMenuInfo(MenuInfo menuInfo);
	
	public int findNodeChildrenMenuId(Integer parentId);
	
	public int deleteMenuInfo(Integer menu_id);
}
