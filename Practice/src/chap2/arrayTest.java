package chap2;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrays = {2, 4, 6, 8, 10};
		int total = 0;
		for(int i = 0; i < arrays.length;i++) {
			total += arrays[i];
		}
		System.out.println("합계: " + total);
		System.out.println("평균: " + (double)total / arrays.length);
		
	}

}
