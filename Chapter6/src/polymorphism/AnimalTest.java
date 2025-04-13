package polymorphism;
class Animal{
	public void move() {System.out.println("동물이 움직입니다.");
}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}
class Horse extends Animal{
	public void move() {
		System.out.println("말이 네 발로 뜁니다.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 높이 날아갑니다.");
	}
}
public class AnimalTest {
	//다형성을 위한 매서드
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Horse());
		aTest.moveAnimal(new Eagle());
	}
}
		
		
	



