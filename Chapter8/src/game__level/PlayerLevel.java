package game__level;

public abstract class PlayerLevel {
	
//추상메서드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	public final void go(int count) {
		run();
		for(int i = 0; i < count;i++) {
			jump();
		}
		turn();
	}
	
	
}
