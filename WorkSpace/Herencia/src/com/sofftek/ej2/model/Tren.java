package com.sofftek.ej2.model;

public class Tren extends Vehiculo{
    private int numBagones;
    public Tren(int velocidad, int velMaxima, int numBagones) {
        super(velocidad, velMaxima);
        this.numBagones = numBagones;
    }
}
