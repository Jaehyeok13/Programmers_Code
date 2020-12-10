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
		int participantCount = 0;
		try {
			while (!key) {
				participantCount  = uc.exisParticipantNum(); // 현재 참가자 수가 0인지 아닌지 판단한다.
				System.out.printf("참가자 최대 인원수는 %2d 입니다.\n", UnfinishedController.SIZE);
				System.out.println("현재 참가자 수는 : " + participantCount + " 명 입니다.");
				if (participantCount < 10) {
					System.out.println("1. 참가자 등록");
				} else {
					System.out.println("10명의 참가자 등록 완료");
				}
				System.out.println("2. 참가자 목록");
				System.out.println("3. 참가자 정보 수정");
				System.out.println("4. 참가자 삭제");
				if (participantCount > 1) {
					System.out.println("5. 참가 완료(한번만 수행)");
				}
				System.out.print("메뉴 번호 선택 : ");
				int num = sc.nextInt();

				switch (num) {
				case 1:	insertParticipant(); break;
				case 2: listParticipant(participantCount); break;
				case 3: updateParticipant(participantCount); break;
				case 4: deleteParticipant(); break;
				case 5: presentParticipant(); key = true; break;
				default:
					System.out.println("메뉴 번호를 잘못 입력 하셨습니다. 다시 입력 해주세요.");
				}
			}
		} catch (Exception e) {
			System.out.println("숫자로 다시 입력해주세요.");
		}
	}
	
	//	새 참가자 등록
	public void insertParticipant() {
		System.out.println("\n새 참가자 등록합니다.");
		System.out.print("참가자 이름을 입력 해주세요 : ");
		String name = sc.next();
		uc.insertParticipant(name);
		System.out.println();
	}

	// 참자가 목록 조회
	public void listParticipant(int participantCount) {
		if(participantCount != 0) {
			uc.listParticipant();
		}else {
			System.out.println("\n참가자가 없습니다.\n");
		}
	}

	// 참가자 정보 수정
	public void updateParticipant(int participantCount) {
		System.out.println();
		if(participantCount == 0) {
			System.out.println("정보를 변경할수 있는 참가자가 존재 하지 않습니다.\n");
		}else {
			System.out.print("참가번호 : ");
			int num = sc.nextInt();
			
			System.out.print("참가자 명 : ");
			String name = sc.next();
			
			if(!uc.updateParticipant(num,name)) {
				System.out.println("입력한 정보와 일치하는 참가자가 없습니다. 다시 확인해주세요.\n");
			}else {
				System.out.print("변경할 참가자 명을 입력 해주세요 : ");
				
			}
			
		}
		
	}
	
	// 참가자 삭제
	public void deleteParticipant() {

	}
	
	// 참가자 목록 제출
	public void presentParticipant() {

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
