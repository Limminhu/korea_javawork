package loop;

public class nestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩 for문 - 반복문 내부에서 반복문이 사용됨.
		//행, 열로 표현
		for(int i = 1; i <= 5;i++) {
			for(int j = 1; j <= 5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i <= 5;i++) {
			for(int j = 1; j <= i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//구구단 전체 출력
		for(int i = 2; i < 10;i++) {
			for(int j = 1; j < 10;j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		    System.out.println();
		    }
		}
		

	}


