package com.sofftek.ej2.model;

public class Perro extends Animal{
    public Perro(){
        super.numPatas = 4;
    }
    @Override
    public String comer() {
        return "Perro comiendo";
    }

    @Override
    public String moverse() {
        return "Perro moviendose";
    }

    public String ladrar(){
        return "Perro ladrando";
    }
}
