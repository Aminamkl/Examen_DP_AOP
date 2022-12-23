package org.example;

import org.example.entities.*;
import org.example.patterns.Adapteur;
import org.example.patterns.StrategyExporterImpl;
import org.example.patterns.StrategyImpl1;

public class Main {
    public static void main(String[] args) {
        //Creation du diagramme
        GroupeClasse classGroup = new GroupeClasse();
        classGroup.setNom("Diagramme de classe Hopitale");

        //Creation de la  classe Patient
        Classe patient = new Classe();
        patient.setNom("Patient");
        patient.setType(ClassType.PUBLIC);
        patient.getConstructeurs().add(new Constructeur());

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

        //Creation de la  classe Docteur
        Classe docteur = new Classe();
        docteur.setNom("Docteur");
        docteur.setType(ClassType.PUBLIC);
        docteur.getConstructeurs().add(new Constructeur());

        Attribut attribut11=new Attribut();
        attribut1.setNom("name");
        attribut1.setIsfinal(false);
        attribut1.setStatique(false);
        attribut1.setType("String");
        attribut1.setVisibilite("Private");

        Attribut attribut22= new Attribut();
        attribut1.setNom("specialité");
        attribut1.setIsfinal(false);
        attribut1.setStatique(false);
        attribut1.setType("String");
        attribut1.setVisibilite("Private");

        docteur.getAttributs().add(attribut11);
        docteur.getAttributs().add(attribut22);

        Methode methode1= new Methode();
        methode1.setNom("getName");
        methode1.setTyperetour("String");
        methode1.setVisibilite("Public");
        methode1.setParametres(null);

        classGroup.add(patient);
        classGroup.add(docteur);


        DiagrammeDeClasse diagrammeDeClasse = new DiagrammeDeClasse();
        diagrammeDeClasse.setStrategyGenerationCode(new StrategyImpl1());
        diagrammeDeClasse.genererCode();

        diagrammeDeClasse.addClass(classGroup);

        System.out.println("------------- Adapter ---------------");
        diagrammeDeClasse.setStrategyGenerationCode(new Adapteur());
        diagrammeDeClasse.genererCode();

        System.out.println("----------------------------------");
        diagrammeDeClasse.setStrategyExporter(new StrategyExporterImpl());
        diagrammeDeClasse.exporterDiagramme();


    }
}
