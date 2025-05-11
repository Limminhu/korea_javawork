package game__level;

public class Player {
private PlayerLevel level;
public Player() {
	level = new Beginner();
	level.showLevelMessage();
	
}
public void play(int count) {
	level.go(count);
}
public void setLevel(PlayerLevel level) {
	this.level = level;
	level.showLevelMessage();
}
}
