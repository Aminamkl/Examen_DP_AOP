package org.example.entities;

import org.example.patterns.Observable;
import org.example.patterns.Observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable o) {
        int nouvelEtat = ((Classe)o).getEtat();
        System.out.println("Observer 1 etat:"+nouvelEtat);
    }
}
