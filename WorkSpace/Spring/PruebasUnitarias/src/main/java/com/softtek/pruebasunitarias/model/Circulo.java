package com.softtek.pruebasunitarias.model;

public class Circulo extends Figura{
    private double radio;
    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }
    public Circulo(double radio) {
        super(0, 0);
        this.radio = radio;
    }
    public String posicion(){
        return super.posicion()+", radio = "+radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio,2);
    }
}
