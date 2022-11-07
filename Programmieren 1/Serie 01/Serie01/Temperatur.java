//Jara Zihlman (20-117-032)
//Vithusan Ramalingam (21-105-515)
//Jan Ellenberger (21-103-643)

import java.util.Scanner;


public class Temperatur {

    public static int t;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int COLD_LIMIT = 15; 
        final int WARM_LIMIT = 24; 

        System.out.println("Geben Sie die Temperatur ein");
        t = scanner.nextInt(); 
        
        //Schleife vergleicht Eingabe mit Limiten
        
        if (t < COLD_LIMIT) {
            System.out.println("Kalt");          
        } 

        else if(t >= WARM_LIMIT) {
            System.out.println("Warm");          
        }

        else{
            System.out.println("Angenehm");          
        }

        System.out.print("Temperaturcheck abgeschlossen");

        
    }
    
}
