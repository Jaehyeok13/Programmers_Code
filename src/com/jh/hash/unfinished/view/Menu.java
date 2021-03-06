package com.jh.hash.unfinished.view;

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
				if(participantCount > 0) {
					System.out.println("3. 참가자 정보 수정");
					System.out.println("4. 참가자 삭제");
				}
				if (participantCount > 1) {
					System.out.println("5. 참가 완료(한번만 수행)");
				}
				System.out.println("9. 종료");
				System.out.print("메뉴 번호 선택 : ");
				try {
					int num = Integer.parseInt(sc.nextLine());
					if((num> 2 && num != 9) && participantCount == 0  ) {
					    num = 6;
					}
					switch (num) {
						case 1: insertParticipant(); break;
						case 2: listMenu(); break;
						case 3: updateParticipant(); break;
						case 4: deleteParticipant(); break;
						case 5: presentParticipant();  break;
						case 9: System.out.println("프로그램 종료 합니다."); key = true;  sc.close(); break;
						default:
							System.out.println("메뉴 번호를 잘못 입력 하셨습니다. 다시 입력 해주세요.\n");
					}
				} catch (NumberFormatException e) {
					System.out.println("숫자로 다시 입력해주세요.\n");
//				    e.printStackTrace();
				}
		}
	}
	
	//	새 참가자 등록
	public void insertParticipant() {
		System.out.println("\n===== 참가자 등록합니다. =====");
		System.out.print("참가자명 입력(공백 자동제거) : ");
		String name = sc.nextLine();
		name = name.replaceAll("\\s", ""); // 공백을 제거 해준다.
		uc.insertParticipant(name);
		System.out.println();
	}

	public void listMenu() {
		boolean key = false;
		while(!key) {
			try {
				System.out.println("===== 참가자 조회 =====");
				System.out.println("1. 참가자명 조회");
				System.out.println("2. 참가번호 조회");
				System.out.println("3. 모든 참가자");
				System.out.println("9. 메뉴로 돌아가기");
				int num = Integer.parseInt(sc.nextLine());
				switch(num) {
				case 1 : key = true; break;
				case 2 : key = true; break;
				case 3 : listParticipantAll(); break;
				default : System.out.println("잘못 입력 하셨습니다. 다시 입력 해주세요."); break;
				}
				
			}catch(NumberFormatException e) {
				System.out.println("숫자로 다시 입력 해주세요.");
			}
		}
	}
	// 참자가 목록 조회
	public void listParticipantAll() {
		if(uc.exisParticipantNum() > 0) {
			System.out.println("\n===== 참가자 명단 =====");
			uc.listParticipantAll();
			System.out.print("====================\n\n");
		}else {
			System.out.println("\n등록된 참가자가 없습니다.\n");
		}
			
	}

	// 참가자 정보 수정
	public void updateParticipant() {
//	    System.out.println();
//	    String name = "";
//	    boolean key = false;
//	    while (!key) {
//		try {
//		    System.out.println("===== 참가자 정보 수정 =====\n0번 메인 메뉴 이동");
//		    System.out.print("참가번호 : ");
//		    int num = Integer.parseInt(sc.nextLine());
//		    if (num == 0) {
//			System.out.println("메인으로 돌아 갑니다.\n");
//			key = true;
//			break;
//		    }
//		    System.out.print("참가자 명 : ");
//		    name = sc.nextLine();
//		    if (!uc.searchParticipant(num, name)) {
//			System.out.println("입력한 정보와 일치하는 참가자가 없습니다. 다시 확인해주세요.\n");
//		    } else {
//			System.out.print("변경할 참가자 명을 입력 해주세요 : ");
//			name = sc.nextLine();
//			uc.updateParticipant(num, name);
//			System.out.println("참가자 정보 수정이 완료 돼었습니다.\n");
//			key = true;
//		    }
//		} catch (Exception e) {
//		    System.out.println("숫자로 다시 입력해주세요.\n");
//		}
//	    }
	}
	
	// 참가자 삭제
	public void deleteParticipant() {
		// 전체 삭제 또는 일부 삭제
		boolean key = false;
		while(!key) {
			try {
				System.out.println("\n===== 참가자 삭제 =====");
				System.out.println("1.특정 참가자 삭제하기");
				System.out.println("2.모든 참가자 삭제하기");
				System.out.println("9.메인으로 돌아가기");
				System.out.print("메뉴 번호 : ");
				int num = Integer.parseInt(sc.nextLine());
				switch(num) {
					case 1:  deleteOne(); break;
					case 2: deleteAll(); break;
					case 9: System.out.println("메인으로 돌아갑니다.\n"); key = true; break;
					default : System.out.println("잘못 입력 하셨습니다. 다시 입력 해주세요.\n");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자로 다시 입력 해주세요.");
			}
		}
	}

	public void deleteOne() {
	    String name = "";
	    int num = 0;
	    boolean key = false;
	    while (!key) {
		try {
		    System.out.println("\n===== 참가자 한명 삭제 =====\n9번 메인 메뉴 이동");
		    System.out.print("참가번호 : ");
		    num = Integer.parseInt(sc.nextLine());

		    if (num == 9) {
			System.out.println("메인으로 돌아 갑니다.\n\n");
			key = true;
			break;
		    }

		    System.out.print("참가자 명 : ");
		    name = sc.nextLine();
		    uc.searchParticipant(num, name);
		    
//		    if (!uc.searchParticipant(num, name)) {
//			System.out.println("입력한 정보와 일치하는 참가자가 없습니다. 다시 확인해주세요.\n");
//		    } else {
//			System.out.print("정말로 삭제 하시겠습니까 ?(Y/N) : ");
//			char answer = sc.next().toUpperCase().charAt(0);
//			sc.nextLine();
//			if (answer == 'Y') {
//			    uc.deleteParticipant(num, name);
//			    System.out.println("정상적으로 처리 돼었습니다.");
//			}
//			key = true;
//		    }
		} catch (NumberFormatException e) {
		    System.out.print("숫자로 다시 입력 해주세요.\n");
		}
	    }
	}
	
	// 모든 참가자 삭제하기
	public void deleteAll() {
	    boolean key = false;
	    while (!key) {
		try {
		    System.out.println("===== 모든 참가자 삭제 =====");
		    System.out.print("모든 참가자를 정말로 삭제 하시겠습니까?(Y/N) : ");
		    char answer = sc.nextLine().toUpperCase().charAt(0);
		    switch (answer) {
		    case 'Y':
			uc.deleteParticipant();
			System.out.println("모든 참가자 정보를 삭제완료 돼었습니다.");
			key = true;
			break;
		    case 'N':
			System.out.println("모든 참가자 삭제를 취소 하셨습니다.\n메인으로 돌아갑니다.\n");
			key = true;
			break;
		    default:
			System.out.println("잘못 입력 하셨습니다. Y/N 로 다시 입력 해주세요.");
			break;
		    }
		} catch (NumberFormatException e) {
		    System.out.println("Y/N 만 입력 가능 합니다. 다시 입력 해주세요.\n");
		}
	    }
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
