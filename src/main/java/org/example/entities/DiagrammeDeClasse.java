package org.example.entities;


import org.example.aspects.Log;
import org.example.patterns.IStrategyExporter;
import org.example.patterns.StrategyGenerationCode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DiagrammeDeClasse {

    private StrategyGenerationCode strategyGenerationCode;
    private IStrategyExporter strategyExporter;
    private  List<Entite> entites = new ArrayList<>();
    private List<Methode> methodes= new ArrayList<>();

    public void setStrategyGenerationCode(StrategyGenerationCode strategyGenerationCode) {
        this.strategyGenerationCode = strategyGenerationCode;
    }
    public void addClass(GroupeClasse classe){
        entites.add(classe);
    }

    public void setStrategyExporter(IStrategyExporter strategyExporter) {
        this.strategyExporter = strategyExporter;
    }
    @Log
    public void genererCode(){
        strategyGenerationCode.genererCode();
    }
    @Log
    public void exporterDiagramme(){
        strategyExporter.exporter();
    }
}
