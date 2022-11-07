//Jara Zihlman (20-117-032)
//Vithusan Ramalingam (21-105-515)
//Jan Ellenberger (21-103-643)

import java.lang.Math;
import java.util.Scanner;









public class Bruchrechner {

    static Scanner scanner1 = new Scanner(System.in);
    public static double a;
    public static double b;

    public static void main(String[] args) {

        ScanVariable(); 

    }
 
    //Methode zur Benutzereingabe  des Bruchs
    public static void ScanVariable(){  

        System.out.println("Bitte a eingeben: ");

        a = scanner1.nextInt();

        System.out.println("Bitte b eingeben: ");
        b = scanner1.nextInt();

        ScanDivisor();

    }

        
    public static void  ScanDivisor() {

        //Schleife um 0 als Divisor auszuschliessen, sonst ausrechnen

        if (b == 0) {
            System.out.println("Diese Eingabe ist ungültig," + 
            "versuchen Sie es nochmal mit einer Zahl > 0");
            ScanVariable();

        }
    
        else {
            int A = (int) (a); int B = (int) (b);
            double c = Math.pow(a,2);
            int C = (int) (c);
            System.out.println("Quotient als Gleitkommazahl: " + c/b);
            System.out.println("Quotient als Ganzzahl: " +  C/B);
            System.out.println("Rest: " + C % B);

        }
            
    }

}
