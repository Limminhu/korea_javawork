package stack;

public class myStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStack stack = new myStack();
		
		//요소 넣기 - 순서(0 - 소, 1 - 고양이, 2 - 강아지)
		stack.push("강아지");
		stack.push("고양이");
		stack.push("소");
		
		//요소 개수
		System.out.println("요소의 총 개수: " + stack.getSize());
		
		//요소 삭제 - 순서(2 - 소, 1 - 고양이, 0 - 강아지)
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
