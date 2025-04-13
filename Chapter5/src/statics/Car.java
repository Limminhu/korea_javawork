package statics;

public class Car {
	private static int serialNum = 1000;//접근제어자 뒤에 static을 붙이면 값을 공유할 수 있다.
  private int carNum;//신차 번호
  
  public Car() {
	  serialNum++;
	  carNum = serialNum;
  }
  //번호 설정
  public void setCarNum(int carNum) {this.carNum = carNum;}
  //번호 가져오기
  public int getCarNum() {return carNum;}
  
}
