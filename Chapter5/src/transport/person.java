package transport;



public class person {
	private String name;//이름
	private int money;//돈
	public person(String name,int money) {
		this.name = name;
		this.money = money;
	}
	public void takeBus(Bus bus,int fee) {
		bus.take(fee);
		this.money -= fee;
	}
	public void personInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
