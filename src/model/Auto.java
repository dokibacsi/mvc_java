package model;
public class Auto {

    Model[] autok;
    public Auto() {
        
    }
    
    public void AutoLetrehoz() {
        autok = new Model[5];
        autok[0] = new Model("TRS918", "Zöld", "Ülésfűtés");
        autok[1] = new Model("VDM263", "Kék");
        autok[2] = new Model("WEG100", "Piros", "Beépített érintőképernyő");
        autok[3] = new Model("POL745", "Sárga", "Digitklíma");
        autok[4] = new Model("VAL221", "Fehér");
    }

    public String Autok() {
        AutoLetrehoz();
        String s = "";
        int index = 1;
        for (Model auto : autok) {
            s += index++ + ". autó: Rendszám: " + auto.getRendszam() + " | Szín: " + auto.getSzin()+" | Extra: " + auto.getExtra() +"\n";
        }
        return s;
    }
    
    
}
