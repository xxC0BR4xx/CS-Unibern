import kap3.Box;
import kap3.Cargo;

/*
Jara Zihlmann(20-117-032) 
Vithusan Ramalingam (21-105-515) 
Jan Ellenberger (21-103-643) 
*/


public class BoxTest {
    public static void main(String[] args) {
        
        Cargo c1 = new Cargo(2, 3, 5, "Grafikkarten");
        Cargo c2 = new Cargo(8, 4, 1, "Playstation 5 Karton");

        Box b1 = new Box(3, 4, 5);
        Box b2 = new Box(1, 2, 3);
        Box b3 = new Box(3, 2, 1);
        Box b4 = new Box(); //Standartkonstruktor

        //addCargo testen
        b1.addCargo(c1);
        b1.toString();
        b4.toString(); // Standartkonstruktor testen
        
        //getter und setter testen
        System.out.println(b1.getCapacity());
        System.out.println(b2.getHeight());
        b3.setLenght(8); // setter testen
        System.out.println(b3.getLenght());
        System.out.println(b3.getWidth());

        b1.addCargo(c2);
        b1.toString();
        System.out.println(b1.getCapacity());
    }
}
