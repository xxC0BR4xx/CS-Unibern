package kap4;

import java.util.Scanner;

public class PairOfDice {

    //2 Dice objekte
    public static Dice d1 = new Dice();
    public static Dice d2 = new Dice();

    public static void main(String[] args) {

        //alle vier Methoden testen
        scanPoints();
        printPoints();

        rollDice();
        //nochmals ausgeben um zu sehen 
        //ob Würfel geändert wurden
        printPoints();

        System.out.println(getTotalPoints());

    }

    //setzen der Punkte nach Benutzereingabe
    public static void scanPoints(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Geben Sie eine Punktzahl für ihren ersten Würfel ein");
        int i = scn.nextInt();
        d1.setPoints(i);
        System.out.println("Geben Sie eine Punktzahl für ihren zweiten Würfel ein");
        int j = scn.nextInt();
        d2.setPoints(j);
    }

    //ausgabe der Punkte auf Würfel
    public static void printPoints(){
        String printPoints1 = "Würfel 1: ";
        String printPoints2 = "Würfel 2: ";

        System.out.println(printPoints1 + d1.getPoints());
        System.out.println(printPoints2 + d2.getPoints());

    }

    //Würfel werfen
    public static void rollDice(){
        System.out.println("Würfel werden neu geworfen:");
        d1.roll();
        d2.roll();

    }

    //Punkte auf Würfel zusammenrechnen und zurückgeben
    public static int getTotalPoints(){

        int getTotalPoints = d1.getPoints() + d2.getPoints();

        return getTotalPoints;

    }
    
}
