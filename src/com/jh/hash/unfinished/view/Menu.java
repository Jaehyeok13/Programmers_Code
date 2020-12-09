package com.jh.hash.unfinished.view;

import java.util.Random;
import java.util.Scanner;

import com.jh.hash.unfinished.controller.UnfinishedController;

public class Menu {
	Scanner sc = new Scanner(System.in);
	UnfinishedController uc = new UnfinishedController();
	public void Participant() {
		// 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 
		// 완주하엿습니다.
		
		//마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열
		// Completion이 주어일 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
		
		// 제한 사항
		// 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
		// 참가자의 이름은 1개이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
		// 참가자 중에는 동명이인이 있을 수 있습니다.
		
		// 참가자 수는 최대 10명 입니다. 
		
		// Ex) participant / completion   /  return
		/*
		 	[leo, kiki, eden]	[eden, kiki]			leo
			[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
			[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
		
		
		예제 #1
		leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

		예제 #2
		vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

		예제 #3
		mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
		 */

		boolean key = false;
		int participantCount = uc.exisParticipantNum(); // 현재 참가자 수가 0인지 아닌지 판단한다.
		while(!key) {
				System.out.printf("참가자 최대 인원수는 %2d 입니다.\n",UnfinishedController.SIZE);
				System.out.println("현재 참가자 수는 : " + participantCount + " 명 입니다.");
				if(participantCount < 10) {
					System.out.println("1. 참가자 등록");
				}else {
					System.out.println("10명의 참가자 등록 완료");
				}
				System.out.println("2. 참가자 목록");
				System.out.println("3. 참가자 삭제");
				System.out.println("");
				key = true;
				
		}
		
//		String participantList[]  = new String[UnfinishedController.SIZE];
//		System.out.println("=== 참가자 명단 ===");
//		
//		for(int i = 0; i < participantList.length; i++) {
//			System.out.print("참가자 명 : ");
//			participantList[i] = sc.next();
//		}
//		System.out.println();
////		
////		// 리스트 확인용
////		for(int i = 0; i < participantList.length; i++) {
////			System.out.println(participantList[i]);
////		}
//		
//		// 통과자는 참가자 길이보다 하나가 작다.
//		String completion[] = new String[participantList.length-1];
//		
//		for(int i = 0; i < completion.length; i++) {
//			System.out.print("완주자 명 : ");
//			completion[i] = sc.next();
//		}
//		
//		System.out.println("\n=== 완주자 명단 ===\n");
//		for(int i  = 0; i < completion.length; i++) {
//			System.out.println(completion[i]);
//		}
//		
//		
		
		
	}
}
