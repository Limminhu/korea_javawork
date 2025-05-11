package remoteControl;

public class SmartTVTest {

	public static void main(String[] args) {
		SmartTV tv = new SmartTV();
		
		RemoteControl rc = tv;
		Searchable searchable = new SmartTV();
		
		rc.turnOn();
		searchable.search("www.naver.com");
		rc.setMute(true);
		rc.turnOff();
		RemoteControl.changeBattery();
	}
	
}
