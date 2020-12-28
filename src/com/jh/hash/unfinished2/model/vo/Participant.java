package com.jh.hash.unfinished2.model.vo;

public class Participant {
    private String name;
    private int code;
    
    public Participant() { }
    public Participant(String name) {
	this.name = name;
    }
    public Participant(String name, int code) {
	this.name = name;
	this.code = code;
    }
    public void setName(String name) {
	this.name = name;
    }
    public String getName() {
	return name;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    
    @Override
    public String toString() {
        return "[참가번호 : " + code + ", 참가자 : "+ name + "]";
    }
    @Override
    public int hashCode() {
	int prime = 31;
	int result = 1;
	prime = prime * result + ((name == null) ? 0 : name.hashCode());
	prime = prime * result + code;
	
        return super.hashCode();
    }
    
    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null) {
            return false;
        }
        if(o.getClass() != getClass()) {
            return false;
        }
        Participant other = (Participant)o;
        if(name == null) {
            if(other.name == null) {
        	return false;
            }
        }else if(!name.equals(other.getName())) {
            return false;
        }
        if(code != other.code) {
            return false;
        }
	return true;
    }
}
