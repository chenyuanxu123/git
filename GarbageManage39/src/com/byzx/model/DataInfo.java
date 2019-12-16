package com.byzx.model;

import java.util.List;

/**@�ļ���: DataInfo.java
 * @�๦��˵��: 
 * @����: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @����: 2019��9��26������9:50:07
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: GuoHaiFeng</li> 
 * 	 <li>����: 2019��9��26������9:50:07</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class DataInfo {

	private Integer data_id;
	private String data_name;
	private String createTime;
	private int delflag;
	private String remark;
	private int state;
	private List<DataDetailInfo> dataDetailInfo;
	private int opt_id;
	
	public int getOpt_id() {
		return opt_id;
	}
	public void setOpt_id(int opt_id) {
		this.opt_id = opt_id;
	}
	public Integer getData_id() {
		return data_id;
	}
	public void setData_id(Integer data_id) {
		this.data_id = data_id;
	}
	public String getData_name() {
		return data_name;
	}
	public void setData_name(String data_name) {
		this.data_name = data_name;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
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
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public List<DataDetailInfo> getDataDetailInfo() {
		return dataDetailInfo;
	}
	public void setDataDetailInfo(List<DataDetailInfo> dataDetailInfo) {
		this.dataDetailInfo = dataDetailInfo;
	}
}









