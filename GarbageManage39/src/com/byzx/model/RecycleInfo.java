package com.byzx.model;



public class RecycleInfo {
	
	private Integer recycle_id;   //����վ���
	private String recycle_name;  //����վ����
	private String  recycle_site;  //����վλ��
	private String recycle_iconCls;  //����վͼ��
	private int recycle_capacity;  //����վ����
	private  int full_status;   //״̬���ж��Ƿ��Ѿ����ˣ���0Ϊδ����1Ϊ������
	private int state;     //״̬���Ƿ�ͣ�ã���0Ϊʹ�ã�1Ϊͣ�ã�
	private int delFlag;  //ɾ����ǣ�0Ϊδɾ����1Ϊɾ����
	private String createtime;  //����ʱ��
	private String remark;   //��ע
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
