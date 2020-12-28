package com.jh.hash.unfinished2.menu;

import java.util.Scanner;

import com.jh.hash.unfinished2.submit.SubmitCode;

public class ViewMenu {
    Scanner sc = new Scanner(System.in);
    SubmitCode subC = new SubmitCode();
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
    
    public void start() {
	System.out.println("=====  프로그래머스 미완주자 =====\n");
	int num = 0;
	boolean keep = false;
	while(!keep) {
	    System.out.println("1. 내가 코드 추가");
	    System.out.println("2. 프로그래머스 코드 제출(제출후 프로그램 종료)");
	    System.out.println("9. 프로그램 종료");
	    System.out.print("메뉴 번호 : ");
	    try {
		num = Integer.parseInt(sc.nextLine());
		switch (num) {
		case 1: createMenu(); break;
		case 2: subMit(); keep = true; sc.close(); break;
		case 9: System.out.println("시스템을 종료 합니다."); keep = true; sc.close(); break;
		default:
		    System.out.println("메뉴에 없는 번호 입니다. 다시 입력 해주세요.\n");
		    break;
		}
		
	    }catch(NumberFormatException e) {
		System.out.println("숫자로 제대로 입력 해주세요.");
	    }
	}
    }
    // 내가 참가자를 만들어서 제출하게 한다.
    public void createMenu() {
	
    }
    
    public void subMit() {
	String [] participant = {"leo","kiki","eden","kiki","leo"};
	String [] completion = {"eden", "kiki","kiki","leo"};
	System.out.println(subC.solution(participant, completion));
	
    }
}
