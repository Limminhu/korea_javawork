package salestatement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drink coffee = new drink("커피",2500,4);
		drink tea = new drink("녹차",3500,3);
		Alcohol soju = new Alcohol("소주",4000,2,15.2f);
		
		//매출전표 출력
		drink.printTitle();//static 매서드는 직접 접근한다.
		coffee.printData();
		tea.printData();
		
		Alcohol.printTitle();//static 매서드는 직접 접근
		soju.printData();
		
		//총합계 금액
		int total = 0;
		total = coffee.calcPrice() + tea.calcPrice() + soju.calcPrice();
		System.out.println("********* 합계 금액: " + total + "원 ******");

	}

}
