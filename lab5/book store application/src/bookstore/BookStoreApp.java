package bookstore;
import java.util.Scanner;
public class BookStoreApp {
	public static void main(String [] args) {
		BookStore store = new BookStore();
		int option ;
        Scanner input = new Scanner(System.in);
        while(true){
        	System.out.println("Enter your option.......");
        	System.out.println("For option 1, display all the books...."
        			+ "For option 2, order one or more books."
        			+ "For option 3, sell one or more books.");
            option = input.nextInt();
            input.nextLine(); 
            if(option ==1){ 
            	store.display();
            }
            else if(option == 2){ 
                String title,author,isbn;
                int numOfCopies;
                System.out.println("Enter book name.....");
                title = input.nextLine();
                System.out.println("Enter Author name.....");
                author = input.nextLine();
                System.out.println("Enter ISBN no of books.....");
                isbn = input.nextLine();
                System.out.println("Enter how much copies .....");
                numOfCopies = input.nextInt();
                input.nextLine(); 
                store.order(title,author,isbn,numOfCopies);
            }
            else if(option ==3){
                String title;
                int numOfCpies;
                System.out.println("Enter book name.....");
                title = input.nextLine();
                System.out.println("Enter how much copies .....");
                numOfCpies = input.nextInt();
                input.nextLine();
                store.sell(title,numOfCpies);
            }
            else if(option==0){
                break;
            }
        }
    }	
}

