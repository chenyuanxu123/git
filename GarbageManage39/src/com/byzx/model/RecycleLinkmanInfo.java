package com.byzx.model;

public class RecycleLinkmanInfo {
	
	private Integer  recycle_linkman_id;  //回收站详情编号
	private Integer recycle_id;  //回收站编号
	private Integer user_id; //回收员编号
	private int state;  //状态
	private int  delFlag;  //删除标记（0为未删除，1为删除）
	private String createtime; //创建时间
	private String remark; //备注
	private String user_name;  //回收员
	 
	
	
	
	public Integer getRecycle_linkman_id() {
		return recycle_linkman_id;
	}
	public void setRecycle_linkman_id(Integer recycle_linkman_id) {
		this.recycle_linkman_id = recycle_linkman_id;
	}
	public Integer getRecycle_id() {
		return recycle_id;
	}
	public void setRecycle_id(Integer recycle_id) {
		this.recycle_id = recycle_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(int delFlag) {
		this.delFlag = delFlag;
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
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	
	
	

}
