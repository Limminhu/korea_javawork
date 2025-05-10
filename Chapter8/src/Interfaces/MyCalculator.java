package Interfaces;

public class MyCalculator implements Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public int times(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 0)
			return Calculator.ERROR;
		else
			return a / b;
	}

}
