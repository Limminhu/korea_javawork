package abstract_class;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cat 객체 생성
		//부모 타입으로 객체 생성 - 다형성
		Animal cat = new cat();
		cat.breathe();
		cat.cry();
		
		Animal Dog = new Dog();
		Dog.breathe();
		Dog.cry();

	}

}
