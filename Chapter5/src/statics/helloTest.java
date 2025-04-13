package statics;

public class helloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인스턴스형
		hello greeting = new hello();
		greeting.sayHello();
//		greeting.sayGoodbye();
		hello.sayGoodbye();//static형 메서드는 클래스 이름으로 접근

	}

}
