package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.MenuInfo;

/**@�ļ���: MenuInfoDao.java
 * @�๦��˵��: 
 * @����: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @����: 2019��9��20������5:22:31
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: GuoHaiFeng</li> 
 * 	 <li>����: 2019��9��20������5:22:31</li> 
 *	 <li>����: </li>
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
