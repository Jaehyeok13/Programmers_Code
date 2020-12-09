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
}



