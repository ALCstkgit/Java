package com.softtek.pruebasunitarias.model;

public class Rectangulo extends Figura{
    private double ancho,alto;
    public Rectangulo(int x, int y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }
    public Rectangulo(double ancho, double alto) {
        super(0, 0);
        this.ancho = ancho;
        this.alto = alto;
    }

    public String posicion(){
        return super.posicion()+", ancho = "+ancho+", alto = "+alto;
    }

    @Override
    public double calcularArea() {
        return this.alto * this.ancho;
    }
}
