package methods;

public class returnMethods {

	//main() - 프로그램을 실행하는 함수
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = square(8);
		System.out.println(value);
		System.out.println(sum(8.8,8));
		System.out.println(message());
		
	}
   //제곱수를 계산하는 함수
	public static int square(int x) {
		return x * x;
	}
	//제곱수를 계산하는 함수 - 매개변수(parameter)
	public static double sum(double x,double y) {
		return x + y;
	}
	public static String message() {
		return "문자열 반환";
	}
}
