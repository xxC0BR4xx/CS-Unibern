package kap4;


public class CoinRace {
    public static void main(String[] args) {
       // Ziel ist es 3 mal hintereinander Kopf zu werfen
        final int GOAL = 3;
        //Zähler für die Münzen und Runden
        int coin1Head=0;
        int coin2Head=0;
        int round = 0;

        Coin c1 = new Coin();
        Coin c2 = new Coin();
        //toString und equals testen
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));
        System.out.println("toString und equals() funktionieren");


        //solange das Ziel von 3mal hintereinander Kopf zu erhalten
        //nicht erfüllt ist, wird die Münze nochmal geworfen
        while (coin1Head < GOAL && coin2Head < GOAL)
        {
           c1.flip();
           c2.flip();
           round ++;


          //Rundenanzahl und Ergebniss des Wurf wird ausgegeben
           System.out.println ("Runde " + round + ": \t"
           + c1.toString() + " " + c2.toString());

  
           //Zähler erhöhen bei aufeinanderfolgenden Würfen 
           //mit dem Ergebnis Kopf, sonst wird der 
           //Zähler zurückgesetzt
           coin1Head = (c1.isHead()) ? coin1Head+1 : 0;
           coin2Head = (c2.isHead()) ? coin2Head+1 : 0;
        }
  
        //Wird das Ziel erreich, muss noch enschieden werden welche Münzen
        //gewonnen hat

        if (coin1Head < GOAL)
           System.out.println ("Münze 2 gewinnt!");
        else
           if (coin2Head < GOAL)
              System.out.println ("Münze 1 gewinnt!");
           else
           //Spezialfall dass beide Münzen 3 mal hintereinander Kopf haben
              System.out.println ("Unentschieden!");
     }

}
    

