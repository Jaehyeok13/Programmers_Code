package com.jh.hash.unfinished.model.vo;

public class person {
	private String name;

	
	public person() {
		super();
	}

	public person(String name) {
		super();
		this.name = name;
	}
	
	public String inform() {
		return "참가자 명 : " + name;
	}
}
