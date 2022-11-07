package kap4;


public class Coin {

    //Variabeln zum ermitteln ob Kopf oder Zahl
    //geworfen wird, Number wird nicht verwendet
    //nur Vollständigkeitshalber aufgeführt
    //für allfällige Erweiterungen dieses Programms
    private final int HEAD = 0;
    private final int NUMBER = 1;

    private int seite;

    //Münze direkt Werfen um einen Anfangswert 
    //der Münze zu kriegen
    public Coin(){

        flip();

    }

    //  50/50 Chance ob 0 oder 1 errechnet wird in random
    // wie oben definiert 0 = Kopf
    // 1 = Zahl
    public void flip(){
        
        seite = (int) (Math.random() * 2);

    }

    // boolean Wert ob Kopf oben ist
    public boolean isHead ()
   {
      return (seite == HEAD);
   }

   // vergleich der obenliegenden Seite
   // um zu schauen ob die Münzen gleich sind
    public boolean equals(Coin coin2){

        if (this.seite == coin2.seite)
            return true;
        else
            return false;

    }

    
    // toSring Methode für Ausgabe
    public String toString(){
        {
            String seiteOben;
      
            seiteOben =  (seite == HEAD)? seiteOben = "Kopf": "Zahl";
            
            return seiteOben;
         }
    }
    
}
