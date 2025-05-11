package remoteControl;

public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rcTV = new Television();
		RemoteControl rcAudio = new Audio();
		
		//tv를 사용
		rcTV.turnOn();
		rcTV.setVolume(7);
		rcTV.setVolume(12);
		rcTV.turnOff();
		//audio를 사용
		rcAudio.turnOn();
		rcAudio.setVolume(-1);//0
//		rcTV.setVolume(12);
		rcAudio.turnOff();

	}

}
