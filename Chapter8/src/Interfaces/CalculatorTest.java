package Interfaces;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculator calc = new MyCalculator();
		try {
		int num1 = 10;
		int num2 = 4;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.div(num1, num2));
		}catch(Exception e){
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}
