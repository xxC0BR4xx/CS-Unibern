package kap3;


/*
Jara Zihlmann(20-117-032) 
Vithusan Ramalingam (21-105-515) 
Jan Ellenberger (21-103-643) 
*/


import java.util.Calendar;

public class Car {

    String brand;
    String model;
    int year;
    static int actualYear =  Calendar.getInstance().get(Calendar.YEAR);
    boolean antique;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    //--------Getter und Setter für Variabeln------------------------
    public String getBrand(){
        return brand;

    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    //--------------------------------------------------------------


    //Funktion zum checken ob Auto älter ist als 45 Jahre und ändert 
    //boolean Wert
    public void isAntique(){

        if ((actualYear - year) > 45){
            antique = true;
            System.out.println(antique);
        }

        else{
            antique = false;
            System.out.println(antique);
        }
             

    }
    

    public String toString() {
        String y = Integer.toString(year);
        return this.getBrand() + "," + this.getModel() + "," + y ;
    }

    
}
