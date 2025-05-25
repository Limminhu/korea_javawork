package system_in_out;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //표준 입출력(메모리[주기억장치] 상에서 실행)
		System.out.println("여러개의 문자를 입력하고 [Enter]를 누르세요.");
		
		try {
			int data;
			//data가 존재하는 동안 
			while((data = System.in.read()) != -1) {
				System.out.print((char)data);
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
