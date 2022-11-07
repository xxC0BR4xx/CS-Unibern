package kap3;

/*
Jara Zihlmann(20-117-032) 
Vithusan Ramalingam (21-105-515) 
Jan Ellenberger (21-103-643) 
*/

/* ************************************************************************* *\
*                Programmierung 1 HS 2020 - Serie 3-1                         * 
\* ************************************************************************* */

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.text.*;

public class Book
{
	private int id;
	private String title;
	private String author;
	private Date dateOfPublication;

	public static final String DATE_FORMAT = "dd.MM.yyyy";

	//--- constructors ---
	public Book(int id, String title, String author, Date dateOfPublication){

		this.id = id;
		this.title = title;
		this.author = author;
		this.dateOfPublication = dateOfPublication;

	}
	
	/** Returns the age of the book in days since publication */
	public long age()
	{
		return (long) TimeUnit.MILLISECONDS.toDays((new Date().getTime() 
		- dateOfPublication.getTime())); 
		
	}

	/** Returns a String representation of the book */
	public String toString()
	{
		Date d = this.getDate();
		return "Id: " + this.getID() +  ", Title: " + this.getTitle() 
		+ ", Author: " + this.getAuthor() + ", Publication: " 
		+ this.dateToString(d); 
	}

	/** Reads all book data from user input */
	public void input() 
	{
		Scanner scn = new Scanner( System.in );
		System.out.print( "Please enter id: " );
		int a = scn.nextInt();
		scn.nextLine();
		setID(a);
		System.out.print( "Please enter title: " );
		String b = scn.nextLine();
		setTitle(b);
		System.out.print( "Please enter author: " );
		String c = scn.next();
		setAuthor(c);
		System.out.print( "Please enter date of publication: " );
		String d = scn.next();
		setDate(stringToDate(d));
		

	}

	//--- Get-/Set-methods ---
	public int getID(){
        return id;

    }

	public void setID(int id){

        this.id = id;
    }

	String getTitle(){
        return title;

    }

	public void setTitle(String title){

        this.title = title;
    }

	String getAuthor(){
        return author;

    }

	public void setAuthor(String author){

        this.author = author;
		
    }

	Date getDate(){
        return dateOfPublication;

    }

	public void setDate(Date dateOfPublication){

        this.dateOfPublication = dateOfPublication;
    }

	// TODO: Insert your code here!

	//--- helper methods -- DO NOT CHANGE ------------------------------------
	/** Converts the Date object d into a String object */
	public static String dateToString( Date d )
	{
		SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
		return fmt.format( d );
	}

	/** Converts the String object s into a Date object */
	public static Date stringToDate( String s ) 
	{
		Date r = null;
		try {
			SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
			r = fmt.parse( s );
		} catch ( ParseException e ){
			System.err.println( e );
			System.exit(1);
		}
		return r;
	}
}
