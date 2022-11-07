package auf3;

import java.util.ArrayList;


//***************************************************
//Datei fuer Serie 6, Teilaufgabe 3
//***************************************************


public class FurnitureTest
{
	/**
	 * creates four different tables with different materials and tests the
	 * different methods
	 * 
	 */
   public static void main (String[] args) {
	   
	   //Table(Material, pricePerHour, workedHours, area)
	   ArrayList<Table> tables = new ArrayList<>();
	   tables.add(new Table(Material.ESCHE, 15, 100, 5));
	   tables.add(new Table(Material.ESCHE, 20, 200, 10));
	   tables.add(new Table(Material.EICHE, 35, 340, 7.5));
	   tables.add(new Table(Material.BUCHE, 25, 200, 9));
	   
	   for (Table table : tables) {
		   StringBuffer message = new StringBuffer();
		   message.append("Tisch " + (tables.indexOf(table) + 1));
		   message.append(" besteht aus " + table.material.name());
		   message.append(". Der Preis für den Aufwand ist " + table.calculateEffort());
		   message.append(" und somit der gesamte Preis gleich " + table.totalPrice());
		   System.out.println(message.toString());
	   }
   }
}