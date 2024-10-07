package model;
public class Model {
    private String rendszam;
    private String szin;
    private String extra;

    public Model(String rendszam, String szin) {
        this(rendszam, szin, "Nincs");
    }

    public Model(String rendszam, String szin, String extra) {
        this.rendszam = rendszam;
        this.szin = szin;
        this.extra = extra;
    }
    

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public String getRendszam() {
        return rendszam;
    }

    public String getSzin() {
        return szin;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    
    
    
}
