package com.byzx.model;

public class IndentInfo {

	private Integer indent_id;     //����id
	private int indent_type;       //�������ͣ�0Ϊ���ţ�1Ϊ���ᣩ 
	private  int classify_if;       //�Ƿ���ࣨ0Ϊ�ǣ�1Ϊ��
	private String indent_intime;      //����ʱ��
	private String indent_outtime;      //���ʱ��
	private int deal_way;                 //���׷�ʽ(0Ϊ�ֽ��ף�1Ϊ���ֽ��ף�
	private Integer  inuser_id;           //�µ�����Ϣ�������û���
	private String inuser_detail_address; //�µ�����ϸ��ַ
	private Integer receive_user_id;     //�ӵ�����Ϣ
	private  String receiving_time;      //�ӵ�ʱ��
	private  int  refuse_weight;        //������������
	private String indent_img;         //ͼƬ��Ϣ
	private double deal_money;        //���׽��
	private int deal_integral;       //���׻���
	private  int indent_status;      //����״̬(0Ϊ���ڴ���1Ϊ�Ѵ�����ɣ�2δ����
	private int state;                //״̬
	private int delFlag;              //ɾ�����(0Ϊ���ڣ�1Ϊɾ����
	private String createtime;        //����ʱ��
	private String remark;            //��ע
	private Integer recycle_id;        //����վ��
	
	
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
