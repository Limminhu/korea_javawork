package memberservice;

public class memberserviceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		memberServiceClass service = new memberServiceClass();
		//true/false를 저장할 변수
		boolean result = service.login("hangang","k2025");
		if(result)
			System.out.println("로그인되었습니다.");
		else
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		service.logout("hangang");
	}

}
