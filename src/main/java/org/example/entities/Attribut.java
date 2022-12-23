package org.example.entities;

public class Attribut {

    private String nom;
    private String type;
    private String visibilite;
    private boolean statique;
    private boolean isfinal;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVisibilite() {
        return visibilite;
    }

    public void setVisibilite(String visibilite) {
        this.visibilite = visibilite;
    }

    public boolean isStatique() {
        return statique;
    }

    public void setStatique(boolean statique) {
        this.statique = statique;
    }

    public boolean isIsfinal() {
        return isfinal;
    }

    public void setIsfinal(boolean isfinal) {
        this.isfinal = isfinal;
    }
}
