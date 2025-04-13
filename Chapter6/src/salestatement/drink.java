package salestatement;

public class drink {
//protected는 상속받는 클래스에서만 접근 가능
protected String name;
protected int price;
protected int quantity;

drink(String name, int price, int quantity){
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
//금액 계산: 가격 x 수량
int calcPrice() {return price * quantity;}
static void printTitle() {//제목행 출력
	System.out.println("상품명\t가격\t수량\t금액");
}
void printData() {//데이터 출력
	System.out.println(name + "\t" + price + "\t" + quantity + "\t" + calcPrice());
}
}
