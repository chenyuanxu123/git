package com.byzx.model;

public class IndentInfo {

	private Integer indent_id;     //订单id
	private int indent_type;       //订单类型（0为上门，1为自提） 
	private  int classify_if;       //是否分类（0为是，1为否）
	private String indent_intime;      //发起时间
	private String indent_outtime;      //完成时间
	private int deal_way;                 //交易方式(0为现金交易，1为积分交易）
	private Integer  inuser_id;           //下单人信息（来自用户表）
	private String inuser_detail_address; //下单人详细地址
	private Integer receive_user_id;     //接单人信息
	private  String receiving_time;      //接单时间
	private  int  refuse_weight;        //回收垃圾重量
	private String indent_img;         //图片信息
	private double deal_money;        //交易金额
	private int deal_integral;       //交易积分
	private  int indent_status;      //订单状态(0为正在处理，1为已处理完成，2未处理）
	private int state;                //状态
	private int delFlag;              //删除标记(0为存在，1为删除）
	private String createtime;        //创建时间
	private String remark;            //备注
	private Integer recycle_id;        //回收站名
	
	
	public Integer getIndent_id() {
		return indent_id;
	}
	public void setIndent_id(Integer indent_id) {
		this.indent_id = indent_id;
	}
	public int getIndent_type() {
		return indent_type;
	}
	public void setIndent_type(int indent_type) {
		this.indent_type = indent_type;
	}
	public int getClassify_if() {
		return classify_if;
	}
	public void setClassify_if(int classify_if) {
		this.classify_if = classify_if;
	}
	public String getIndent_intime() {
		return indent_intime;
	}
	public void setIndent_intime(String indent_intime) {
		this.indent_intime = indent_intime;
	}
	public String getIndent_outtime() {
		return indent_outtime;
	}
	public void setIndent_outtime(String indent_outtime) {
		this.indent_outtime = indent_outtime;
	}
	public int getDeal_way() {
		return deal_way;
	}
	public void setDeal_way(int deal_way) {
		this.deal_way = deal_way;
	}
	public Integer getInuser_id() {
		return inuser_id;
	}
	public void setInuser_id(Integer inuser_id) {
		this.inuser_id = inuser_id;
	}
	public String getInuser_detail_address() {
		return inuser_detail_address;
	}
	public void setInuser_detail_address(String inuser_detail_address) {
		this.inuser_detail_address = inuser_detail_address;
	}
	public Integer getReceive_user_id() {
		return receive_user_id;
	}
	public void setReceive_user_id(Integer receive_user_id) {
		this.receive_user_id = receive_user_id;
	}
	public String getReceiving_time() {
		return receiving_time;
	}
	public void setReceiving_time(String receiving_time) {
		this.receiving_time = receiving_time;
	}
	public int getRefuse_weight() {
		return refuse_weight;
	}
	public void setRefuse_weight(int refuse_weight) {
		this.refuse_weight = refuse_weight;
	}
	public String getIndent_img() {
		return indent_img;
	}
	public void setIndent_img(String indent_img) {
		this.indent_img = indent_img;
	}
	public double getDeal_money() {
		return deal_money;
	}
	public void setDeal_money(double deal_money) {
		this.deal_money = deal_money;
	}
	public int getDeal_integral() {
		return deal_integral;
	}
	public void setDeal_integral(int deal_integral) {
		this.deal_integral = deal_integral;
	}
	public int getIndent_status() {
		return indent_status;
	}
	public void setIndent_status(int indent_status) {
		this.indent_status = indent_status;
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
	public Integer getRecycle_id() {
		return recycle_id;
	}
	public void setRecycle_id(Integer recycle_id) {
		this.recycle_id = recycle_id;
	}
    
	
	 
	
	
	
}
