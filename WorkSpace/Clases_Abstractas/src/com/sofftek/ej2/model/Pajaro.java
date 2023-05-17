package com.sofftek.ej2.model;

public class Pajaro extends Animal{
    public Pajaro(){
        super.numPatas = 2;
    }
    @Override
    public String comer() {
        return "Pajaro come";
    }

    @Override
    public String moverse() {
        return "Pajaro se mueve";
    }
}
