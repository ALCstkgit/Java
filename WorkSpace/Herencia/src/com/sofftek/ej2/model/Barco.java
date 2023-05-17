package com.sofftek.ej2.model;

public class Barco extends Vehiculo{
    private int tripulantes;

    public Barco(int velocidad, int velMaxima, int tripulantes) {
        super(velocidad, velMaxima);
        this.tripulantes = tripulantes;
    }
}
