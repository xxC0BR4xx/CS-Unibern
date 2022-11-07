package auf1;
/*
Jara Zihlmann(20-117-032) 
Vithusan Ramalingam (21-105-515) 
Jan Ellenberger (21-103-643) 
*/

import java.util.ArrayList;


public class Order {
    // counter for the id of a new order
    public static int idCounter = 0;

    private final int id;
    private String customerName;
    private String customerAddress;
    private ArrayList<Book> books = new ArrayList<>();

    //increase order id with new order
    public Order() {
        id = Order.idCounter += 1;
    }

    // add a book to the order
    public void addBook(Book book) {
        this.books.add(book);
    }

    //set name of Customer for order
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    //set the customers adress of an order
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    
    //toString method to represent all books from one order with a string
    @Override    
    public String toString() {
        String stringRepresentation = "Order id: " + id +
                " Customer: " + customerName + ", " + customerAddress + '\n';

        for (Book book : this.books) {
            stringRepresentation += book.toString() + "\n";
        }

        return stringRepresentation;
    }
}