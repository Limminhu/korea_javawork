package constant;

public class Constant {

	static int num = 20;
	static final int NUM = 100;
	public static void main(String[] args) {
//		NUM = 1000; - 변경 불가
		System.out.println(num);
		System.out.println(NUM);
	}

}
