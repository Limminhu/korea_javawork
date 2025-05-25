package system_in_out;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //표준 입출력(메모리[주기억장치] 상에서 실행)
		System.out.println("한개의 문자를 입력하고 [Enter]를 누르세요.");
		
		try {
			int data = System.in.read();//아스키 코드값으로 지정
			System.out.println((char)data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
