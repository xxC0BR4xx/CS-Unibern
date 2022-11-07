package kap3;
import kap3.Cargo;


/*
Jara Zihlmann(20-117-032) 
Vithusan Ramalingam (21-105-515) 
Jan Ellenberger (21-103-643) 
*/

public class Box {

    int lenght;
    int widht;
    int height;
    Cargo cargo;

    
    boolean full;

    public Box(int lenght, int widht, int height){

        this.lenght = lenght;
        this.widht = widht;
        this.height = height;
    }

    //-------------------Getter und Setter----------------
    public int getLenght(){
        return lenght;

    }

    public void setLenght(int lenght){
        this.lenght = lenght;
    }

    public int getWidth(){
        return widht;
    }

    public void setWidth(int widht){
        this.widht = widht;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }
    //-------------------------------------------

    //Standartkonstruktor
    public Box(){
        lenght = 1;
        widht = 1;
        height = 1;
    }
    
    public int getCapacity(){
        return  lenght * widht * height;
    }

    public void addCargo(Cargo cargo){
        if (cargo.lenght <= lenght && cargo.widht 
            <= widht && cargo.height <= height){
            full = true;
            System.out.println(full);
        }
        else{
            full = false;
            System.out.println(full);
        }
    }
    public String toString() {
        // TODO Auto-generated method stub
        System.out.println("Box: " + this.getLenght() 
        + "," + this.getWidth() + "," + this.getHeight());
        return super.toString();
    }
}
