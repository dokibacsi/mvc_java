package main;

import controler.Controler;
import model.Auto;
import view.FelugroView;

public class Program {
    
    public static void main(String[] args) {
        new Controler(new Auto(), new FelugroView());
    }
    
}
