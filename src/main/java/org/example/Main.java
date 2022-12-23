package org.example;

import org.example.entities.*;

public class Main {
    public static void main(String[] args) {
        //Creation du diagramme
        GroupeClasse classGroup = new GroupeClasse();
        classGroup.setNom("Diagramme de classe Hopitale");

        //Creation d'une classe
        Classe patient = new Classe();
        patient.setNom("Patient");
        patient.setType(ClassType.PUBLIC);
        patient.getConstructeurs().add(new Constructeur());

        //Creation des attributs
        Attribut attribut1=new Attribut();
        attribut1.setNom("name");
        attribut1.setIsfinal(false);
        attribut1.setStatique(false);
        attribut1.setType("String");
        attribut1.setVisibilite("Private");

        Attribut attribut2= new Attribut();
        attribut1.setNom("age");
        attribut1.setIsfinal(false);
        attribut1.setStatique(false);
        attribut1.setType("int");
        attribut1.setVisibilite("Private");

        patient.getAttributs().add(attribut1);
        patient.getAttributs().add(attribut2);

        Methode methode= new Methode();
        methode.setNom("getName");
        methode.setTyperetour("String");
        methode.setVisibilite("Public");
        methode.setParametres(null);

        patient.getMethodes().add(methode);

        classGroup.add(patient);
    }
}
