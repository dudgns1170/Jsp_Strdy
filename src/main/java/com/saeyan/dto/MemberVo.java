package com.saeyan.dto;
//회원 정보를 저장하기 위해 사용되는 
public class MemberVo {
	private  int code;
	private String name;
	private String userid;
	private String pwd;
	private String email;
	private String phone;
	private int admin;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "MemberVo [code=" + code + ", name=" + name + ", userid=" + userid + ", pwd=" + pwd + ", email=" + email
				+ ", phone=" + phone + ", admin=" + admin + "]";
	}

	
	
}
