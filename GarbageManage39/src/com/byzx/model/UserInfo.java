package com.byzx.model;
/**@�ļ���: UserInfo.java
 * @�๦��˵��: 
 * @����: GuoHaiFeng
 * @Email: 1191619897@qq.com
 * @����: 2019��9��19������4:15:54
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: GuoHaiFeng</li> 
 * 	 <li>����: 2019��9��19������4:15:54</li> 
 *	 <li>����: </li>
 * </pre>
 */
public class UserInfo {

	private Integer user_id;		//�û�id
	private String user_name;		//�û�����
	private String user_pwd;		//�û�����
	private String user_phone;		//�û��绰
	private String user_idCard;		//�û����֤��
	private int user_integral;		//�û�����
	private Integer role_id;		//��ɫId
	private Integer plot_id;		//С������id
	private String user_site;		//�û���λ
	private int state;				//״̬
	private int delFlag;			//ɾ�����,0Ϊδɾ����1Ϊɾ��
	private String createtime;		//����ʱ��
	private String remark;			//��ע
	private String role_name;		//��ɫ����
	private int opt_id;
	
	public int getOpt_id() {
		return opt_id;
	}

	public void setOpt_id(int opt_id) {
		this.opt_id = opt_id;
	}

	public UserInfo() {}

	public UserInfo(String user_name, String user_pwd) {
		this.user_name = user_name;
		this.user_pwd = user_pwd;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_idCard() {
		return user_idCard;
	}

	public void setUser_idCard(String user_idCard) {
		this.user_idCard = user_idCard;
	}

	public int getUser_integral() {
		return user_integral;
	}

	public void setUser_integral(int user_integral) {
		this.user_integral = user_integral;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public Integer getPlot_id() {
		return plot_id;
	}

	public void setPlot_id(Integer plot_id) {
		this.plot_id = plot_id;
	}

	public String getUser_site() {
		return user_site;
	}

	public void setUser_site(String user_site) {
		this.user_site = user_site;
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

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	@Override
	public String toString() {
		return "UserInfo [user_id=" + user_id + ", user_name=" + user_name + ", user_pwd=" + user_pwd + ", user_phone="
				+ user_phone + ", user_idCard=" + user_idCard + ", user_integral=" + user_integral + ", role_id="
				+ role_id + ", plot_id=" + plot_id + ", user_site=" + user_site + ", state=" + state + ", delFlag="
				+ delFlag + ", createtime=" + createtime + ", remark=" + remark + "]";
	}
}









