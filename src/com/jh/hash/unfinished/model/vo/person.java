package com.jh.hash.unfinished.model.vo;

public class person {
	private String name;
	private int number;
	
	public void setPerson(String name) {
		this.name = name;
	}

	public String getPerson() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	public person() {
		super();
	}

	public person(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String inform() {
		return  "참가번호 : " + number + "\t참가자명  : " + name;
	}
}
