package reference;

public class circle {
Point center;
int radius;//반지름
final double PI = 3.14;

//생성자
public circle(int x, int y,int radius) {
	center = new Point(x,y);
	this.radius = radius;
}
//원의 넓이를 계산
public double getArea() {
	double area = PI * radius * radius;
	return area;
}
//원의 정보 출력
public void showCircleInfo() {
	System.out.println("원의 중심은(" + center.getX() + ","+ center.getY()
	+ ")이고,반지름은 " + radius + "입니다.");
}



}
