package classes;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BankAccount 객체 생성
		
		BankAccount account1 = new BankAccount();//기본 생성자는 매개변수가 없으므로
		                                         //클래스 내부 private 멤버 변수에 접근할 수 없음.
		                                         //private을 지우면 접근할 수 있음.
		BankAccount account2 = new BankAccount("222-333","최규리",20000);
		account1.setAno("111-222");
		account1.setBalance(0);
		account1.setOwner("나저축");
		//계좌번호 출력 - account1의 정보
//		System.out.println("계좌번호: " + account1.getAno());
//		System.out.println("계좌주: " + account1.getOwner());
//		System.out.println("잔고: " + account1.getBalance());
//		//account2의 정보
		account1.displayInfo();
		account2.displayInfo();
		
		
	}

}
