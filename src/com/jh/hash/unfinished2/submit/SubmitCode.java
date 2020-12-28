package com.jh.hash.unfinished2.submit;

import java.util.HashMap;

public class SubmitCode {
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
    // 단순하게 프로그래머스 코드 제출이다.
//    private String[] participant = {"leo","kiki","eden","leo"};
//    private String[] completion= {"eden","kiki"};
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> list = new HashMap<String, Integer>();
//        for(String  p : participant) {
//            //   System.out.println(Arrays.toString(participant));
//            //						        「  값이 존재 할경우 1씩 누적해준다.
//            list.put(p, list.getOrDefault(p, 0)+1);
//            //				ㄴ> 찾는 키가 존재하면 해당 키의 값을 반환하고, 없으면 기본값을 반환함
//        System.out.printf("%s\n",list);
//        }
        for(String p : participant) list.put(p, list.getOrDefault(p, 0) + 1);
        System.out.println("참가자 ㅣ " + list);
        for(String c : completion) list.put(c, list.get(c)-1);
        System.out.println("완주자 ㅣ " + list);
        // 완주자 키의 값이 0이 아닌 경우 완주를 못한 경우다.
        for(String result : list.keySet()) {
            if(list.get(result) != 0) {
        	answer = result;
            }
        }
        return answer;
    }
}
