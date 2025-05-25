package Interfaces.inheritance;

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyClass 객체 생성
		MyClass myClass = new MyClass();
		
		//부모 타입으로 생성
		X x = myClass;
		x.x();
		
		Y y = myClass;
		y.y();
		
		//X,Y를 상속한 iClass 객체 생성
		//부모 타입으로 자동 형변환
		MyInterface iClass = myClass;
		iClass.method();
		iClass.x();
		iClass.y();

	}

}
