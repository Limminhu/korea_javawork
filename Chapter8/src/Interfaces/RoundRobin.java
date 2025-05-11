package Interfaces;

public class RoundRobin implements Schedular{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담 순서를 순서대로 대기열에서 가져옵니다.");
		
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("다음 순서 상담원에게 순서대로 배분합니다.");
	}

}
