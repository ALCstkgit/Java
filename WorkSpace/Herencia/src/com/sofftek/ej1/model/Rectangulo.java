package com.sofftek.ej1.model;

public class Rectangulo extends Figura{
    private double ancho,alto;
    public Rectangulo(int x, int y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    public String posicion(){
        return super.posicion()+", ancho = "+ancho+", alto = "+alto;
    }
}
