package com.byzx.model;

public class Plot_refInfo {
   
	private Integer plot_ref_id; //С���ӱ�id
	private int plot_id;        //С��id
	private int buliding_num;   //¥��
	private int state;          //״̬
	private String createtime;  //����ʱ��
	private int delflag;        //ɾ�����
	private String remark;      //��ע
	

	public Integer getPlot_ref_id() {
		return plot_ref_id;
	}
	public void setPlot_ref_id(Integer plot_ref_id) {
		this.plot_ref_id = plot_ref_id;
	}
		
	public int getPlot_id() {
		return plot_id;
	}
	public void setPlot_id(int plot_id) {
		this.plot_id = plot_id;
	}
	public int getBuliding_num() {
		return buliding_num;
	}
	public void setBuliding_num(int buliding_num) {
		this.buliding_num = buliding_num;
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

	
	
}
