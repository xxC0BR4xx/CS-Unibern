// Jan Ellenberger (21-103-643)
// Vithusan Ramalingam (21-105-515)
// Jara Zihlmann (20-117-032)




import java.util.Scanner;

public class Rechteck {
	public static double l; //Länge des Rechtecks
	public static double b; //Breite des Rechtecks
	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bitte Breite b des Rechtecks eingeben: ");
		b = scan.nextInt();
		System.out.print("Bitte Länge l des Recktecks eingeben: ");
		l = scan.nextInt();
		
		System.out.println("Fläche des Rechtecks: "+ (l*b));
		System.out.println("Umfang des Rechtecks: " + (2*l+2*b));
		
		if (b==l) {
			System.out.println("Das Rechteck ist ein Quadrat.");
		}
		else {
			System.out.println("Es ist kein Quadrat.");
		}
			
		}
}
		
	
