package com.byzx.model;

import java.util.List;

/**@文件名: DataInfo.java
 * @类功能说明: 
 * @作者: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @日期: 2019年9月26日上午9:50:07
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: GuoHaiFeng</li> 
 * 	 <li>日期: 2019年9月26日上午9:50:07</li> 
 *	 <li>内容: </li>
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









