package org.example.entities;



import org.example.aspects.Log;
import org.example.patterns.Observable;
import org.example.patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Classe extends Entite implements Observable {
    List<Attribut> attributs =new ArrayList<>();
    List<Methode> methodes = new ArrayList<>();
    List<Constructeur> constructeurs = new ArrayList<>();
    private int etat;
    private ClassType type;

    public ClassType getType() {
        return type;
    }

    public void setType(ClassType type) {
        this.type = type;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public List<Attribut> getAttributs() {
        return attributs;
    }

    public void setAttributs(List<Attribut> attributs) {
        this.attributs = attributs;
    }

    public List<Methode> getMethodes() {
        return methodes;
    }

    public void setMethodes(List<Methode> methodes) {
        this.methodes = methodes;
    }

    public List<Constructeur> getConstructeurs() {
        return constructeurs;
    }

    public void setConstructeurs(List<Constructeur> constructeurs) {
        this.constructeurs = constructeurs;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    List<Observer> observers = new ArrayList<>();

    @Override
    @Log
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(this);
        }
    }
}
