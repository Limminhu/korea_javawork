package abstract_class;

public class cat extends Animal{

	public cat() {
		this.kind = "포유류";
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("야~~옹");
	}
}
