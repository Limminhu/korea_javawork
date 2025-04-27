package bankapp;

import java.util.Scanner;

public class BankMain {
static BankAccount[] accounts = new BankAccount[100];
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean sw = true;
		
		while(sw) {
			System.out.println("===================================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("===================================");
			System.out.print("선택> ");
			
			//문자를 정수형으로 변환
			int selectNum = Integer.parseInt(scan.nextLine());
			switch(selectNum) {
			case 1:
				createAccount();
				break;
			case 2:
				getAccountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				sw = false;
				break;
				default:
					System.out.println("지원되지 않는 기능입니다. 다시 입력하세요.");
					break;
			}
		}//while 닫기

     scan.close();
	}//main() 닫기
	private static void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("====================================");
		System.out.println("           출           금           ");
		System.out.println("====================================");
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();//계좌 입력
		
		if(findAccount(ano) != null) {//일치되는 계좌번호가 있으면 
			BankAccount account = findAccount(ano);
			//예금 = 잔고 + 입금액
			System.out.println("출금액: ");
			int amount = Integer.parseInt(scan.nextLine());
			if(amount > account.getBalance())
				System.out.println("잔액이 부족합니다.다시 입력하세요.");
			else {
			account.setBalance(account.getBalance() - amount);
			System.out.println("결과: 정상 출금되었습니다. 현재 잔액: " + account.getBalance());
			}
		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}
		
	}
	private static BankAccount findAccount(String ano) {
		BankAccount account = null;//개체 초기화
		for(int i = 0; i < accounts.length;i++) {
			if(accounts[i] != null) {
				String dbAno = accounts[i].getAno();
				if(dbAno.equals(ano)) {
					account = accounts[i];//그 객체를 저장해서 반환함
					break;
				}
			}
		}
		
		return account;
	}
	private static void deposit() {
		// TODO Auto-generated method stub
		System.out.println("====================================");
		System.out.println("           예           금             ");
		System.out.println("====================================");
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();//계좌 입력
		
		if(findAccount(ano) != null) {//일치되는 계좌번호가 있으면 
			BankAccount account = findAccount(ano);
			//예금 = 잔고 + 입금액
			System.out.println("입금액: ");
			int amount = Integer.parseInt(scan.nextLine());
			account.setBalance(account.getBalance() + amount);
			System.out.println("결과: 정상 입금되었습니다. 현재 잔액: " + account.getBalance());
		
		}else {
			System.out.println("결과: 계좌가 없습니다.");
		}
	}
	private static void getAccountList() {
		// 계좌 목록
		
		for(int i = 0; i < accounts.length;i++) {
			if(accounts[i] != null) {
			System.out.println("계좌번호: " + accounts[i].getAno() + "\t");
			System.out.println("계좌주: " + accounts[i].getOwner() + "\t");
			System.out.println("잔액: " + accounts[i].getBalance() + "\n");
		}
		}
		
	}
	private static void createAccount() {
		// 계좌 생성
		System.out.println("====================================");
		System.out.println("           계  좌  생  성             ");
		System.out.println("====================================");
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();//계좌 입력
		
		System.out.print("계좌주: ");
		String owner = scan.nextLine();
		
		System.out.print("초기 입금액: ");
		int balance = Integer.parseInt(scan.nextLine());
		
		//첫번째 위치에 계좌 생성
//		accounts[0] = new BankAccount(ano, owner, balance);
		for(int i = 0; i < accounts.length;i++) {
			if(accounts[i] == null) {
				accounts[i] = new BankAccount(ano, owner, balance);
			System.out.println("결과: 계좌가 생성되었습니다.");
			break;
			}
		}
		
		
	}

}
