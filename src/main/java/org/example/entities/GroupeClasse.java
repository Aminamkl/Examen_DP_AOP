package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class GroupeClasse extends Entite{

    private List<Entite> childs = new ArrayList<>();


    public Entite add(Entite c){
        c.level=this.level+1;
        childs.add(c);
        return c;
    }

}
