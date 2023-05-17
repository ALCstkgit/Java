package com.sofftek.ej1.model;

public class Circulo extends Figura{
    private double radio;
    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }
    public String posicion(){
        return super.posicion()+", radio = "+radio;
    }
}
