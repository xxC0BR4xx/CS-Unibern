package auf2;
//***************************************************
//Datei fuer Serie 6, Teilaufgabe 2
//***************************************************


public class Book implements IArticle
{
	private int id;
	private String title;
	private String author;
	private int year;
	private int price; 

	//Konstruktor für buch
	public Book( int id, String title, String author, int year, int price )
	{
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
		this.price = price;
	}
	//**getter */ 
	public String getDescription()
	{
		return id + " (Book) " + title + ", by " + author +
			", " + year + ", " + price + " CHF";
	}

	public int getPrice() {
		return price; 
	}

	public int getId() { 
		return id; 
	}
	//*getter */
}
