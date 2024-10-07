package controler;

import model.Auto;
import view.FelugroView;

public class Controler {

    private Auto model;
    private FelugroView nezet;

    public Controler(Auto model, FelugroView nezet) {
        this.model = model;
        this.nezet = nezet;
        start();
    }

    public void start() {
        nezet.bemutat(model.Autok());
        
    }

}
