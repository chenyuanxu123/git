package com.byzx.model;

public class RecycleLinkmanInfo {
	
	private Integer  recycle_linkman_id;  //����վ������
	private Integer recycle_id;  //����վ���
	private Integer user_id; //����Ա���
	private int state;  //״̬
	private int  delFlag;  //ɾ����ǣ�0Ϊδɾ����1Ϊɾ����
	private String createtime; //����ʱ��
	private String remark; //��ע
	private String user_name;  //����Ա
	 
	
	
	
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
