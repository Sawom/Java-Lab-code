package bookstore;
public class Book {
	String bookTitle;
	String bookAuthor;
	String bookISBN;
	int numOfCopies;
	
	Book(String bookTitle, String bookAuthor, String bookISBN, int numOfCopies){
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookISBN = bookISBN;
		this.numOfCopies = numOfCopies;	
	}
	
	void display() {
		System.out.println("Title--\n"+bookTitle+"Author--\n"+bookAuthor+"ISBN-- \n"+bookISBN+"Quantity-- \n"+numOfCopies);
	}
}
