package Interfaces.innerInterface;

public class Button {
private onClickListener listener;

//내부 인터페이스
interface OnClickListener{
	//추상 인터페이스
	public void onClick();
}
//setter
public void setListener(OnClickListener listener) {
	this.listener = listener;
}
//버튼 터치 메서드 정의
public void touch() {
	listener.onClick();
}
}
