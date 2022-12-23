package org.example.entities;


import org.example.aspects.Log;
import org.springframework.stereotype.Component;

@Component
public class Entite {
    protected String nom;
    protected int level;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Log
    public  String tab(){
        String tab="";
        for (int i=0;i<level;i++){
            tab+="\t";
        }
        return tab;
    }


}
