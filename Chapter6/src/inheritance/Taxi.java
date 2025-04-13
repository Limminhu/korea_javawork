package inheritance;

public class Taxi extends Car{
int passenger;
Taxi(String brand, int year, int passenger){
	super(brand,year);//super를 아래 쓰면 안 됨.
	this.passenger = passenger;
	
}
//부모 메서드 재정의(오버라이딩-Overriding)
//@Override
//void carInfo() {
//	System.out.println("모델명: " + brand);
//	System.out.println("연식: " + year);
//	System.out.println("승객수: " + passenger);
//}
@Override
void carInfo() {
	// TODO Auto-generated method stub
	super.carInfo();
}

}
