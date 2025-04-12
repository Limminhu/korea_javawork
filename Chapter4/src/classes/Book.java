package classes;

public class Book {

	
		private int bookNumber;
		private String bookTitle;
		private String author;

		public Book(int bookNumber,String bookTitle, String author) {
			this.bookNumber= bookNumber;
			this.bookTitle = bookTitle;
			this.author = author;
	}
 public void showInfo() {
	 System.out.println(bookNumber + ": " + bookTitle + ", "+ author);
 }
}
