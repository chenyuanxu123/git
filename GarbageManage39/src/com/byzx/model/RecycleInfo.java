package com.byzx.model;



public class RecycleInfo {
	
	private Integer recycle_id;   //回收站编号
	private String recycle_name;  //回收站名称
	private String  recycle_site;  //回收站位置
	private String recycle_iconCls;  //回收站图标
	private int recycle_capacity;  //回收站容量
	private  int full_status;   //状态（判断是否已经满了）（0为未满，1为已满）
	private int state;     //状态（是否停用）（0为使用，1为停用）
	private int delFlag;  //删除标记（0为未删除，1为删除）
	private String createtime;  //创建时间
	private String remark;   //备注
	private RecycleLinkmanInfo recycleLinkmanInfo;
	
	
	
	public Integer getRecycle_id() {
		return recycle_id;
	}
	public void setRecycle_id(Integer recycle_id) {
		this.recycle_id = recycle_id;
	}
	public String getRecycle_name() {
		return recycle_name;
	}
	public void setRecycle_name(String recycle_name) {
		this.recycle_name = recycle_name;
	}
	public String getRecycle_site() {
		return recycle_site;
	}
	public void setRecycle_site(String recycle_site) {
		this.recycle_site = recycle_site;
	}
	public String getRecycle_iconCls() {
		return recycle_iconCls;
	}
	public void setRecycle_iconCls(String recycle_iconCls) {
		this.recycle_iconCls = recycle_iconCls;
	}
	public int getRecycle_capacity() {
		return recycle_capacity;
	}
	public void setRecycle_capacity(int recycle_capacity) {
		this.recycle_capacity = recycle_capacity;
	}
	public int getFull_status() {
		return full_status;
	}
	public void setFull_status(int full_status) {
		this.full_status = full_status;
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
	public RecycleLinkmanInfo getRecycleLinkmanInfo() {
		return recycleLinkmanInfo;
	}
	public void setRecycleLinkmanInfo(RecycleLinkmanInfo recycleLinkmanInfo) {
		this.recycleLinkmanInfo = recycleLinkmanInfo;
	}

}
