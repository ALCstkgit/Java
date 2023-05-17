package com.softtek.ejercicioVolador.model;

public class Avion extends Vehiculo implements ObjetoVolador{
    @Override
    public String despegar() { return "Despegar"; }

    @Override
    public String aterrizar() { return "Aterrizar"; }

    @Override
    public String volar() { return "Volar"; }
}
