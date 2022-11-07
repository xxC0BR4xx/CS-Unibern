import kap3.Thermometer;

/*
Jara Zihlmann(20-117-032) 
Vithusan Ramalingam (21-105-515) 
Jan Ellenberger (21-103-643) 
*/


public class ThermometerTest {
public static void main(String[] args) {
    Thermometer t1 = new Thermometer(37.0);
    t1.increase();
    t1.increase();
    Thermometer t2 = new Thermometer(37.0);
    t2.increase();
    t2.increase();
    t2.increase();
    //Konstruktor setzt Temperatur sowiso auf 37.0 
    //nur wichtig dass man double einsetzt und nicht int
    //da Konstruktor double verlangt
    Thermometer t3 = new Thermometer(10.0);
    t3.increase();
    t3.increase();
    t3.increase();
    t3.increase();
    System.out.println(t3.getTemp());
    if(t1.getTemp() == 37.2){        
        System.out.println("increase() & getTemp() funktionieren");
    }
    if(t2.getTemp() >= 37.2){        
        t2.reset();
        System.out.println(t2.getTemp() + "reset() funktioniert auch" );
    }
    }
}


