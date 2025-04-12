package reference;

public class circleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//circle 객체 생성
		circle c1 = new circle(2,3,5);
		circle c2 = new circle(8,8,10);
		System.out.println("========== 원의 정보 =========");
		c1.showCircleInfo();
		System.out.printf("원의 넓이: %.2f\n", c1.getArea());
		c2.showCircleInfo();
		System.out.printf("원의 넓이: %.2f\n",c2.getArea());

	}

}
