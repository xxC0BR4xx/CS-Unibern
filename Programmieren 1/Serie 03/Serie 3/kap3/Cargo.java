package kap3;


/*
Jara Zihlmann(20-117-032) 
Vithusan Ramalingam (21-105-515) 
Jan Ellenberger (21-103-643) 
*/


public class Cargo {

    public int lenght;
    public int widht;
    public int height;
    public String name;

    public Cargo(int lenght, int widht, int height, String name){
        this.lenght = lenght;
        this.widht = widht;
        this.height = height;
        this.name = name;        
        }

    
    //------------------Getter und Setter------------------------------

    int getLenght(){
        return lenght;
    }

    public void setLenght(int lenght){
        this.lenght = lenght;
    }

    int getWidth(){
        return widht;
    }

    public void setWidth(int widht){
        this.widht = widht;
    }

    int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    //-------------------------------------------------------
    
    public String toString() {
        return this.widht + this.lenght + this.height + name;
    }
}
