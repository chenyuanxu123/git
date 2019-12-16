package com.byzx.model;

public class RefuseGarbageInfo {
	
	public Integer refuse_id;  
	public Integer recycle_id;
	public double  refuse_weight;
	public int state;
	public int delFlag;
	public String createtime;
	public String remark;
	public String recycle_name;
	
	
	public Integer getRefuse_id() {
		return refuse_id;
	}
	public void setRefuse_id(Integer refuse_id) {
		this.refuse_id = refuse_id;
	}
	public Integer getRecycle_id() {
		return recycle_id;
	}
	public void setRecycle_id(Integer recycle_id) {
		this.recycle_id = recycle_id;
	}
	public double getRefuse_weight() {
		return refuse_weight;
	}
	public void setRefuse_weight(double refuse_weight) {
		this.refuse_weight = refuse_weight;
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
	public String getRecycle_name() {
		return recycle_name;
	}
	public void setRecycle_name(String recycle_name) {
		this.recycle_name = recycle_name;
	}
	
	
	

}
