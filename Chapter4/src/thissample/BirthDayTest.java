package thissample;
//private를 생략하면 default로 public과 유사
class BirthDay{
	int year;
	int month;
	int day;
	
	public void setYear(int year) {this.year = year;}
	public void printThis() {System.out.println(this);}
}
public class BirthDayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthDay today = new BirthDay();
		today.setYear(2025);
		System.out.println(today);
		today.printThis();

	}
}

