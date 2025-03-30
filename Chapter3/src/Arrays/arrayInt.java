package Arrays;

public class arrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[]number = new int[4];
		
//		System.out.println(number[0]);
		int[] number = {10, 20, 30, 40, 50};
//		for(int i = 0; i < 4;i++) {
//			number[i] = (i + 1) * 10;
//		}//요소 저장
		number[2] = 100;//요소 수정
		for(int i = 0; i < number.length;i++) {
			System.out.print(number[i] + " ");
		}
		int total = 0;//합계를 저장할 변수
		for(int i = 0; i < number.length;i++) {
			total += number[i];
		}
		System.out.println("합계: " + total);
		System.out.println("평균: " + (double)total / number.length);
		System.out.println();
	}

}
