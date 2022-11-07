// Jan Ellenberger (21-103-643)
// Vithusan Ramalingam (21-105-515)
// Jara Zihlmann (20-117-032)


import java.util.Scanner;
import java.util.Random;

public class Additionsaufgabe {
	public static int a;
	public static int b;
	
	public static void main(String[] args) {
		Random random = new Random();
		a = random.nextInt(21);
		b = random.nextInt(21- a);
		
		
		System.out.print(a + " + " + b + " = ");
		
		Scanner scan = new Scanner(System.in);
		int result = scan.nextInt();
		
		if (result == (a+b)) {
			System.out.print("Sie haben die Aufgabe richtig gelöst.");
		}
		
		else {
			System.out.print("Leider ist ihr Ergebnis nicht korrekt");
		}
			
		
	}
}
