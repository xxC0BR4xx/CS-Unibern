import kap3.Book;


/*
Jara Zihlmann(20-117-032) 
Vithusan Ramalingam (21-105-515) 
Jan Ellenberger (21-103-643) 
*/

public class BookShelf {

    public static void main(String[] args) {
        Book book1 = new Book(1, "title", "author", new java.util.Date(System.currentTimeMillis()) );
        book1.input();
        System.out.println(book1.getID());
        System.out.println(book1.toString());
        System.out.println(book1.age() + " " + "Days old");


        
    }
    
}
