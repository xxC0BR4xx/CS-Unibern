package kap3;


/*
Jara Zihlmann(20-117-032) 
Vithusan Ramalingam (21-105-515) 
Jan Ellenberger (21-103-643) 
*/


public class Thermometer {
    
    private double temp;

    public Thermometer(Double temp) {
        //Temperatur soll standartmässig auf 37 gesetzt sein
        this.temp = 37;
    }
        //getter
    public double getTemp(){
        return temp;
    }

    public void increase(){
        temp += 0.1;    
    }

    public void reset(){   
        //Thermometer zurücksetzen 
        temp = 37;
    }
}
