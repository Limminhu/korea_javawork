package loop;

public class forEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자 세트 - 아스키 코드, 유니 코드
		char ch;//전역 변수
//		ch = 65;
//		ch++;//형 변환 필요 없음, 일반 수식은 형 변환 필요
//		System.out.println(ch);
		for(ch = 65;ch < 123;ch++) {
			System.out.println(ch);
		}
		//한글 출력 - 유니코드
		for(ch = 12593; ch < 12686;ch++) {
			System.out.print(ch + " ");
		}
		int dan = 6;
		for(int i = 0; i < 10;i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}

	}

}
