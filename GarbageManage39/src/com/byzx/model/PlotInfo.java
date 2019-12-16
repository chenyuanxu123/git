package com.byzx.model;

import java.util.List;

public class PlotInfo {
  
	private Integer plot_id;     //小区id
	private String  plot_name;   //小区名称
	private String  plot_site;   //小区大门经纬度
	private String  plot_scope;  //小区范围
	private String  plot_district;  //所属区域
	private int recycle_id;      //回收站信息
	private String recycle_name;  //回收站名称
	private int state;           //状态
	private String createtime;   //创建时间
	private int delflag;         //删除标记
	private String remark;       //备注
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
