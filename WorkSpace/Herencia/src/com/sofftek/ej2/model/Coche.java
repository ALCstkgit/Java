package com.sofftek.ej2.model;

public class Coche extends Vehiculo{
    private int numRuedas;

    public Coche(int velocidad, int velMaxima, int numRuedas) {
        super(velocidad, velMaxima);
        this.numRuedas = numRuedas;
    }

    public String pitar(){
        return "Coche Pitando";
    }
}
