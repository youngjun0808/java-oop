package com.bitcamp.domains;

public class MemberBean {
	private String id, pw, name, ssn, blood;
	private Double height, weight;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getHeight() {
		return this.height;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getWeight() {
		return this.weight;
	}
	@Override
	public String toString() {
		// 이름,아이디,비번,주민번호,혈액형,키,몸무게
		// TODO Auto-generated method stub
		return String.format("[회원정보: \n"
				+ "이름: %s\n"
				+ "아이디: %s\n"
				+ "비번: %s\n"
				+ "주민번호: %s\n"
				+ "혈액형: %s형 \n"
				+ "키: %scm \n"
				+ "몸무게: %skg]"
				, name, id, pw, ssn, blood, height, weight);
	}

}
