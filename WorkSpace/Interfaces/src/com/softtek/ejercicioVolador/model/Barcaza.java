package com.softtek.ejercicioVolador.model;

public class Barcaza extends Vehiculo implements Nautico{
    @Override
    public String atracar() { return "Atracar"; }

    @Override
    public String navegar() { return "Navegar"; }
}
