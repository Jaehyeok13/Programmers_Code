package com.jh.hash.unfinished.controller;

import com.jh.hash.unfinished.model.vo.person;

public class UnfinishedController {
	public static final int SIZE = 10;
	person p[] = new person[SIZE];
	
	// 현재  참가자 수 가져오기
	public int  exisParticipantNum() {
		int num = 0;
		
		for(int i = 0; i < p.length; i++) {
			if(p[i] != null) 
				num += 1;
		}
		return num;
	}
	
	// 새참가자 등록
	public void insertParticipant(String name) {
		p[exisParticipantNum()] = new person(name, exisParticipantNum()+1);
		System.out.println(name + "참가자 등록됐습니다.");
	}
	
	// 참가자 목록 출력
	public void listParticipant() {
		System.out.println("\n===== 참가자 명단 =====");
		for(int i = 0; i < exisParticipantNum(); i++) {
			System.out.println(p[i].inform());
		}
		System.out.print("====================\n\n");
	}
	
	// 참가자 정보 확인
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
	public void updateParticipant(int num,String name) {
		p[num-1].setPerson(name);
		System.out.println("참가자 정보 수정이 완료 돼었습니다.\n");
	}
	
	public void deleteParticipant(int num, String name) {
		p[num-1] = new person();
		System.out.println("참가 신청이 정상적으로 처리 돼었습니다.");
	}

}



