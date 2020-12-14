package com.jh.hash.unfinished.controller;

import com.jh.hash.unfinished.model.vo.Person;

public class UnfinishedController {
    public static final int SIZE = 10;
    Person p[] = new Person[SIZE];

    // 현재 참가자 수 가져오기
    public int exisParticipantNum() {
	int num = 0;

	for (int i = 0; i < p.length; i++) {
	    if (p[i] != null)
		num += 1;
	}
	return num;
    }

    // 새참가자 등록
    public void insertParticipant(String name) {
	int num = 0;
	if(exisParticipantNum() < 0) {
	    for(int i = 0; i < exisParticipantNum(); i++) {
		for(int j = 0; j < i; j++) {
			while(num < 10000) {
		    num = ((int)(Math.random() * 99999) + 1);
			}
		    if(p[i].getNumber() == num) {
			j--;
			break;
		    }
		}
	    }
	}else {
	    num = (int)(Math.random() * 99999) + 1;
	}
	p[exisParticipantNum()] = new Person(name, num);
	System.out.println(name + "님의 참가 번호는 '" + num +"'입니다.\n참가자 번호는 참가자 조회,정보 수정, 삭제에 필요한 정보입니다.");
    }

    // 참가자 목록 출력
    public void listParticipantAll() {
	for (int i = 0; i < exisParticipantNum(); i++) {
	    System.out.println(p[i].inform());
	}
    }

    // 참가자 정보 확인
  /*
    public boolean searchParticipant(int num, String name) {
	boolean key = false;
	for (int i = 0; i < exisParticipantNum(); i++) {
	    if (p[i].getPerson().equals(name) && p[i].getNumber() == num) {
		key = true;
	    }
	}
	return key;
    }

    // 참가자 정보 수정
    public void updateParticipant(int num, String name) {
	p[num].setPerson(name);
    }
    */
    
    // 참가자 정보 확인
    public Person[] searchParticipant(int num, String name) {
	Person[] p = new Person[exisParticipantNum()];
	for(int i = 0; i < p.length; i++) {
	    
	}
	return p;
    }
    // 참가자 정보 수정
    
    // 참가자 정보 삭제
    public void deleteParticipant(int num, String name) {
	p[num] = new Person();
	for(int i = num; i < exisParticipantNum() ; i++) {
	    p[i] = p[i+1];
	}
    }

    public void deleteParticipant() {
	p = new Person[SIZE];

    }

}
