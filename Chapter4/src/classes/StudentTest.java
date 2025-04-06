package classes;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스의 인스턴스 생성
		Student s1 = new Student(); // s1 객체 생성
		Student s2 = new Student(1001,"신유빈",2);
		
		s1.studentId = 1000;
		System.out.println("학번: " + s1.studentId);
		
		s1.name = "이정후";
		System.out.println("이름: " + s1.name);
		
		s1.grade = 3;
		System.out.println("학년: " + s1.grade);
		//s1처럼 직접 접근하는 방법은 객체지향 프로그래밍의 oop에 어긋난다.
		
		s2.studentInfo();
		
		//객체 출력
		//클래스 이름 : 패키지 이름, 클래스이름
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
