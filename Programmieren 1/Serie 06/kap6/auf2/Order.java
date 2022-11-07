package auf2;

import java.util.ArrayList;


public class Order {

    public static int idCounter = 0;

    private final int id;
    private String customerName;
    private String customerAddress;
    private ArrayList<IArticle> articles = new ArrayList<>();

     // counter for the id of a new order
    public Order() {
        id = Order.idCounter += 1;
    }

    //calculate Price of all ordered articles together
    public int getTotalPrice() {
        int total = 0;
        for (IArticle article : articles) {
            total += article.getPrice();
        }
        return total;
    }

   
    public Iterable<IArticle> getOrderedArticles() {
        return this.articles;
    }

    // add article to order
    public void add(IArticle article) {
        this.articles.add(article);
    }
    //** setter and getter*/
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }
    //**setter and getter */

    
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", books=" + articles.toString() +
                '}';
    }
}