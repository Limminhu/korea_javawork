package Interfaces;

import java.io.IOException;

public class SchedularTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//입력 처리 - System.in.read()을 사용
		
		//메뉴 만들기
		System.out.println("전화 상담 배분 방식을 선택하세요: ");
		System.out.println("R: 한 명씩 차례대로 배분");
		System.out.println("L: 대기가 가장 적은 상담원에게 먼저 배분");
		System.out.println("P: 우선순위가 가장 높은 고객에게 먼저 배분");
		
		int ch = System.in.read();//1개의 문자 입력
		
		Schedular schedular = null;
		if(ch == 'R' || ch == 'r') {
			schedular = new RoundRobin();
		}else if(ch == 'L' || ch == 'l') {
			schedular = new LeastJob();
		}else if(ch == 'P' || ch == 'p') {
			schedular = new PriorityAllocation();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		schedular.getNextCall();  //메서드 호출
		schedular.sendCallToAgent();
		

	}

}
