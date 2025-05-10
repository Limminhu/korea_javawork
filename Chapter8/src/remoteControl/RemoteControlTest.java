package remoteControl;

public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rcTV = new Television();
		
		rcTV.turnOn();
		rcTV.setVolume(7);
		rcTV.setVolume(12);
		rcTV.turnOff();

	}

}
