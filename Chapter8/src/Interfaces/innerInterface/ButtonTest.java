package Interfaces.innerInterface;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Button button = new Button();
		
		//CallListener 객체 생성
		button.setListener(new CallListener());
		button.touch();
	}

}
