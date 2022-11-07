// Jan Ellenberger (21-103-643)
// Vithusan Ramalingam (21-105-515)
// Jara Zihlmann (20-117-032)

import java.util.Scanner;
import java.util.Random;


public class Benutzernamengenerator {
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bitte Vornamen eingeben: ");
		String Vorname = scan.next();
		
		System.out.print("Bitte Nachnamen eingeben: ");
		String Nachname = scan.next();
		
		Random rand = new Random();

		char F = Vorname.charAt(0);

		var l = Nachname.length();

		
		
		
		if (l < 5) {
			/*check ob Nachname kürzer ist als 5 Zeichen, 
			wenn ja gibt benutzen wir Nachnamen für Generator , sonst die ersten 5 Zeichen
			*/
						
			int D1 = rand.nextInt(10);
			int D2 = rand.nextInt(10);
			int D3 = rand.nextInt(10);
			
			
			System.out.println(F + Nachname + D1 + D2 + D3);

			
		}
		else {
						
			
			var n = Nachname.substring(0,5);
			
			int D1 = rand.nextInt(10);
			int D2 = rand.nextInt(10);
			int D3 = rand.nextInt(10);
			
			
			System.out.println(F + n + D1 + D2 + D3);

		}
		
		//Passwort generieren
		
		
		int P1 = rand.nextInt(2 + 1)+7;
		int P2 = rand.nextInt(10);
		int P3 = rand.nextInt(10);
		int P4 = rand.nextInt(10);
		int P5 = rand.nextInt(10);
		int P6 = rand.nextInt(10);
		
		/*
		 * int zu string konvertieren um bei print 
		 * nachher nicht zusammengerechnet zu werden
		 */
		
		String p1 = Integer.toString(P1);
		String p2 = Integer.toString(P2);
		String p3 = Integer.toString(P3);
		String p4 = Integer.toString(P4);
		String p5 = Integer.toString(P5);
		String p6 = Integer.toString(P6);

		
		int randomnumber1 = rand.nextInt(26)+ 65;
		int randomnumber2 = rand.nextInt(26)+ 65;
		int randomnumber3 = rand.nextInt(26)+ 65;

		char d1 = (char) randomnumber1;
		char d2 = (char) randomnumber2;
		char d3 = (char) randomnumber3;
	
		
	    System.out.print(p1 + p2 + p3 + p4 + p5 + p6 + "-" + d1 + d2 + d3);
		
	}

}
