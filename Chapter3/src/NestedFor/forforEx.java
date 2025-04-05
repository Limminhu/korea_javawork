package NestedFor;

public class forforEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 5;i++) {
			for(int j = 0; j < 5;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
//		int num = 0; ++num 출력
		for(int i = 0; i < 5;i++) {
			for(int j = 0; j < 5;j++) {
				if(i* 5 + (j + 1) > 23)
					break;
				System.out.print(i* 5 + (j + 1) + " ");
			}
			System.out.println();
		}

	}

}
