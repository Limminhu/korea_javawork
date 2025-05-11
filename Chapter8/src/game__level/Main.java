package game__level;

public class Main {
	
	public static void main(String[] args) {
		//초보자 객체 생성
		Player player = new Player();
		player.play(1);
		
		//중급자 객체 생성
		AdvancedLevel aLevel = new AdvancedLevel();
		SuperLevel sLevel = new SuperLevel();
		player.setLevel(aLevel);
		player.play(2);
		player.setLevel(sLevel);
		player.play(3);
	}
	

}
