package com.jh.hash.phonenumber.view;

import java.util.Scanner;

import com.jh.hash.phonenumber.controller.PhoneController;

public class Menu {
    Scanner sc = new Scanner(System.in);
    PhoneController pc = new PhoneController();
    
    public void MainMenu() {
	boolean key = true;
	boolean check = false;
	int num = 0;
	while (key) {
	    try {
		System.out.println("===== 메인 메뉴 =====");
		if(!check) {
		    System.out.println("1. 전화번호 목록 생성");
		}
		if(check) {
		System.out.println("2. 전화번호 목록 확인");
		System.out.println("3. 전화번호 목록 삭제");
		System.out.println("4. 데이터 결과 확인");
		}
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		num = Integer.parseInt(sc.nextLine());
		
		if((num > 1 && num != 9) && !check) {
		    num = 0;
		}else if(num == 1 && check){
		    num = 0;
		}
		
		switch (num) {
		case 1: phoneList(); check = true; break;
		case 2: 
		    break;
		case 3: check = false; 
		    break;
		case 4:
		    break;
		case 9: System.out.println("프로그램 종료합니다."); key = false; sc.close();
		    break;
		default:
		    System.out.println("잘못 입력 하셨습니다. 다시 입력 해주세요.\n");
		}
	    } catch (NumberFormatException e) {
		System.out.println("숫자로 입력 해주세요.\n");
	    }
	}
    }
    
    public void phoneList() {
	
    }
    
}
