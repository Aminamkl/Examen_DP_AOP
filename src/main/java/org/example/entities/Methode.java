package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Methode {

    private String typeretour;
    private String visibilite;
    private String nom;
    List<Parametre> parametres =  new ArrayList<>();

    public List<Parametre> getParametres() {
        return parametres;
    }

    public void setParametres(List<Parametre> parametres) {
        this.parametres = parametres;
    }

    public String getTyperetour() {
        return typeretour;
    }

    public void setTyperetour(String typeretour) {
        this.typeretour = typeretour;
    }

    public String getVisibilite() {
        return visibilite;
    }

    public void setVisibilite(String visibilite) {
        this.visibilite = visibilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
