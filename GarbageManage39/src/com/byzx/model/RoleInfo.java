package com.byzx.model;
/**@�ļ���: RoleInfo.java
 * @�๦��˵��: 
 * @����: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @����: 2019��9��20������4:51:59
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: GuoHaiFeng</li> 
 * 	 <li>����: 2019��9��20������4:51:59</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class RoleInfo {
	
	private Integer role_id;
	private String role_name;
	private String menu_ids;
	private int state;
	private int delflag;
	private String createtime;
	private String remark;
	private int opt_id;
	
	
	
	public int getOpt_id() {
		return opt_id;
	}
	public void setOpt_id(int opt_id) {
		this.opt_id = opt_id;
	}
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getMenu_ids() {
		return menu_ids;
	}
	public void setMenu_ids(String menu_ids) {
		this.menu_ids = menu_ids;
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
}
