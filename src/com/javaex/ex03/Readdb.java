package com.javaex.ex03;

public class Readdb {

	//fields
	private String name;
	private String hp;
	private String company;
	
	//constructors
	public Readdb() {
		
	}
	
	public Readdb(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
		
	}
	
	//method g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	//method
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("핸드폰 : " + hp);
		System.out.println("회사 : " + company);
		System.out.println();
	}
	
}
