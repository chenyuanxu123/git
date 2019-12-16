package com.byzx.model;
/**@文件名: MenuInfo.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月20日下午4:53:39
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月20日下午4:53:39</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class MenuInfo {

	private Integer menu_id;
	private String menu_name;
	private String menu_iconCls;
	private String menu_path;
	private String menu_state;
	private int state;
	private int delflag;
	private String createtime;
	private String remark;
	private int parentId;
	private int opt_id;
	
	public int getOpt_id() {
		return opt_id;
	}
	public void setOpt_id(int opt_id) {
		this.opt_id = opt_id;
	}
	public Integer getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Integer menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getMenu_iconCls() {
		return menu_iconCls;
	}
	public void setMenu_iconCls(String menu_iconCls) {
		this.menu_iconCls = menu_iconCls;
	}
	public String getMenu_path() {
		return menu_path;
	}
	public void setMenu_path(String menu_path) {
		this.menu_path = menu_path;
	}
	public String getMenu_state() {
		return menu_state;
	}
	public void setMenu_state(String menu_state) {
		this.menu_state = menu_state;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public int getDelflag() {
		return delflag;
	}
	public void setDelflag(int delflag) {
		this.delflag = delflag;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
}
