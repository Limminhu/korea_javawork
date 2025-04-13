package memberservice;

public class memberServiceClass {
//로그인 일치 여부를 반환하는 메서드
	public boolean login(String id, String pw) {
		//id - "hangang", password - "k2025"
		//equals() - 문자열 비교
		if(id.equals("hangang") && pw.equals("k2025"))
			return true;
		return false;
	}
	public void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
}
