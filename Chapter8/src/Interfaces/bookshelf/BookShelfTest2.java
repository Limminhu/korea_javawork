package Interfaces.bookshelf;

public class BookShelfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue shelfQueue = new BookShelf();
        
        shelfQueue.enQueue("혼공 Java");
    	shelfQueue.enQueue("채식주의자");
    	
    	//요소의 수
    	System.out.println("요소의 총 개수: " + shelfQueue.getSize());
    	
    	//요소 꺼내기
    	System.out.println(shelfQueue.deQueue());
    	System.out.println(shelfQueue.deQueue());
    	System.out.println(shelfQueue.deQueue());
    	System.out.println(shelfQueue.deQueue());
	}

}
