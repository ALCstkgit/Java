package com.softtek.pruebasunitarias.model;

public abstract class Figura {
    private int x, y;

    public Figura(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String posicion() {
        return "x = "+x+", y = "+y;
    }

    public abstract double calcularArea();
}
