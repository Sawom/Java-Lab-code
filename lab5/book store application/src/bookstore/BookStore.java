package bookstore;
public class BookStore {
	Book[] books;
	int totalbooks;
	int presentbooks;
	
	BookStore(){
		totalbooks = 10;
		presentbooks = 0;
		books = new Book[10];
	}
	
	void sell(String title, int sellcopies) {
		int sign = 0;
		for(int i=0;i<presentbooks;i++){
			if(books[i].bookTitle.equals(title)==true ) {
				 sign=1;
				if(sellcopies<=books[i].numOfCopies) {
					books[i].numOfCopies=books[i].numOfCopies-sellcopies;
					System.out.println("Done!!  "+title+"Copies: "+sellcopies );
				}
				else {
					System.out.println("Not enough books in store....");
					System.out.println("Books found : "+books[i].numOfCopies);
				}
			}
		}
		if(sign==0) {
			System.out.println("Not found in store ......"+title);
		}
	}
	


	void order(String title , String author, String isbn, int orderNumOfCopies){
        int sign = 0;
        for(int i =0 ; i<presentbooks ;i++){
            if(books[i].bookTitle.equals(title)){
            	sign =1;
                books[i].numOfCopies+= orderNumOfCopies;
            }
        }

        if(sign == 0){
        
            if(presentbooks<totalbooks){
                books[presentbooks] = new Book(title,author,isbn,orderNumOfCopies);
                presentbooks++;
            }
        }

    }
	
	void display(){
        for(int i=0; i< presentbooks;i++){
            books[i].display();
        }
    }
}
