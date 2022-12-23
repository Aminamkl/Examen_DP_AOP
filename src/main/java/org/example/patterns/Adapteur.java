package org.example.patterns;


import org.example.entities.AncienneImpGenerateCode;

public class Adapteur extends AncienneImpGenerateCode implements StrategyGenerationCode{

    @Override
    public void genererCode() {
        genererCode();
    }

}
