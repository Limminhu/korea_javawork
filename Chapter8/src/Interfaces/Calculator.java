package Interfaces;

public interface Calculator{
	int ERROR = -9999;
	//모든 메서드가 추상메서드이다.
	//정수형 계산기 구현 - 더하기, 빼기, 곱하기, 나누기
    int add(int a,int b);
    int substract(int a,int b);
    int times(int a, int b);
    int div(int a, int b);

}
