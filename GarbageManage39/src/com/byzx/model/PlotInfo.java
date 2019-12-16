package com.byzx.model;

import java.util.List;

public class PlotInfo {
  
	private Integer plot_id;     //С��id
	private String  plot_name;   //С������
	private String  plot_site;   //С�����ž�γ��
	private String  plot_scope;  //С����Χ
	private String  plot_district;  //��������
	private int recycle_id;      //����վ��Ϣ
	private String recycle_name;  //����վ����
	private int state;           //״̬
	private String createtime;   //����ʱ��
	private int delflag;         //ɾ�����
	private String remark;       //��ע
	private List<Plot_refInfo> plot_refInfo;
	
	
	public List<Plot_refInfo> getPlot_refInfo() {
		return plot_refInfo;
	}
	public void setPlot_refInfo(List<Plot_refInfo> plot_refInfo) {
		this.plot_refInfo = plot_refInfo;
	}
	public Integer getPlot_id() {
		return plot_id;
	}
	public void setPlot_id(Integer plot_id) {
		this.plot_id = plot_id;
	}
	public String getPlot_name() {
		return plot_name;
	}
	public void setPlot_name(String plot_name) {
		this.plot_name = plot_name;
	}
	public String getPlot_site() {
		return plot_site;
	}
	public void setPlot_site(String plot_site) {
		this.plot_site = plot_site;
	}
	public String getPlot_scope() {
		return plot_scope;
	}
	public void setPlot_scope(String plot_scope) {
		this.plot_scope = plot_scope;
	}
	public String getPlot_district() {
		return plot_district;
	}
	public void setPlot_district(String plot_district) {
		this.plot_district = plot_district;
	}
	public int getRecycle_id() {
		return recycle_id;
	}
	public void setRecycle_id(int recycle_id) {
		this.recycle_id = recycle_id;
	}
	public String getRecycle_name() {
		return recycle_name;
	}
	public void setRecycle_name(String recycle_name) {
		this.recycle_name = recycle_name;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public int getDelflag() {
		return delflag;
	}
	public void setDelflag(int delflag) {
		this.delflag = delflag;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "PlotInfo [plot_id=" + plot_id + ", plot_name=" + plot_name + ", plot_site=" + plot_site
				+ ", plot_scope=" + plot_scope + ", plot_district=" + plot_district + ", recycle_id=" + recycle_id
				+ ", state=" + state + ", createtime=" + createtime + ", delflag=" + delflag + ", remark=" + remark
				+ "]";
	}

	
}
