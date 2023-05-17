package com.sofftek.ej2.model;

public class Avion extends Vehiculo{
    private int turbinas;
    public Avion(int velocidad, int velMaxima, int turbinas) {
        super(velocidad, velMaxima);
        this.turbinas = turbinas;
    }

    public String despegar(){
        return "Avion despegando";
    }
}
