package transport;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person 객체 생성
		person p1 = new person("이정후",10000);
		person p2 = new person("최민정",20000);
		//버스 객체 생성
		Bus bus100 = new Bus(100);
		
		int feeOfBus = 1500;
		//버스 타기
		p1.takeBus(bus100, feeOfBus);
		p2.takeBus(bus100, feeOfBus);
		
		//정보 출력
		p1.personInfo();
		bus100.busInfo();

	}

}
