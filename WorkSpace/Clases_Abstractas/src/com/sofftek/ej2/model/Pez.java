package com.sofftek.ej2.model;

public class Pez extends Animal{
    public Pez(){
        super.numPatas = 0;
    }
    @Override
    public String comer() {
        return "Pez come";
    }

    @Override
    public String moverse() {
        return "Pez se mueve";
    }
}
