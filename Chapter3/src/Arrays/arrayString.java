package Arrays;

public class arrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"소나타","EV3","BMW"};//문자열 배열 지정
		
		System.out.println(cars[2]);//BMW 검색
		
		cars[1] = "Ionic5";
		
		for(int i = 0; i < cars.length;i++) {
			System.out.print(cars[i] + " ");
		}

	}

}
