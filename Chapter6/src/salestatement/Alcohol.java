package salestatement;

public class Alcohol extends drink{
private float alcper;
	Alcohol(String name, int price, int quantity,float alcper) {
		super(name, price, quantity);
		this.alcper = alcper;
		// TODO Auto-generated constructor stub
	}
	//매서드 재정의 - static은 override를 붙이지 않는다.
	static void printTitle() {//제목행 출력
		System.out.println("도수[%]\t가격\t수량\t금액");
	}
	@Override
	void printData() {//데이터 출력
		System.out.println(name + "(" + alcper + "\t" + price + "\t" + quantity + "\t" + calcPrice());
	}

}
