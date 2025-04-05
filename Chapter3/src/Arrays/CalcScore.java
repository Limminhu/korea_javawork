package Arrays;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//성적 처리 프로그램
		boolean run = true;
		int studentNum = 0;
		int[] score = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("==========================");
			System.out.println("1.학생 수| 2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("==========================");
			System.out.println("선택> ");
			
			int menu = sc.nextInt();//메뉴 입력
			switch(menu) {
			case 1:
				System.out.print("학생 수>");
				studentNum = sc.nextInt();
				score = new int[studentNum];
				break;
			case 2:
				for(int i = 0; i < score.length;i++) {
					System.out.print("scores[" + i + "]");
					score[i] = sc.nextInt();
				}
				break;
			case 3:
				for(int i = 0; i < score.length;i++) {
					System.out.print("scores[" + i + "] = " + score[i]);
					score[i] = sc.nextInt();
				}
				break;
				
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			}
		}

	}

}
