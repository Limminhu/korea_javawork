package game__level;

public class Beginner extends PlayerLevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("점프 할 줄 몰라요.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("턴 할 줄 몰라요.");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("*****초보자 레벨입니다.*****");
		
	}

	
}
