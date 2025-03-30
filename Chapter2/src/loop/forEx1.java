package loop;

public class forEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(초기값;종료값;증감값)
		//1 ~ 10 까지 출력
		int total = 0;//합계를 저장할 정수형 변수
		double avg;//평균을 저장할 실수형 변수
		for(int n = 1; n <= 10;n++) {
			System.out.println(n);
			total += n;
		}
		System.out.println("합계: " + total);
		System.out.println("평균: " + (double)total / 10);
	}

}
