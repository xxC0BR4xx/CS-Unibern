import kap3.Car;

/*
Jara Zihlmann(20-117-032) 
Vithusan Ramalingam (21-105-515) 
Jan Ellenberger (21-103-643) 
*/


public class Garage {

    public static void main(String[] args) {
        

        Car c1 = new Car("Toyota", "Supra MK4", 2001);
        Car c2 = new Car("Hyundai", "i30 N", 2021);
        Car c3 = new Car("Dodge", "Challenger", 1970);
        

        System.out.println(c1.toString());
        c3.isAntique(); //test ob antique funktioniert
        System.out.println(c2.getBrand()); //test ob getter funktioniert
        System.out.println(c3.toString());
        c3.setYear(2010);   //test ob setter funktioniert
        System.out.println(c3.toString());

    }
    
}
