package chap2;

import java.util.Scanner;

public class 자동판매기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		int leftover = 5;
		
		while(leftover > 0) {
			System.out.println("돈을 넣어주세요");
			int money = scanner.nextInt();
			
			if(money == 500) {
				leftover -= 1;
				System.out.println("커피 한 잔 구매");
			}
			else if(money > 500) {
				leftover -= 1;
				System.out.println("커피 한 잔 구매, 잔액은" + (money - 500) + "원입니다.");
			}
				else
					System.out.println("돈이 부족합니다.");
			
		}
		System.out.println("커피 소진");
	}

}
