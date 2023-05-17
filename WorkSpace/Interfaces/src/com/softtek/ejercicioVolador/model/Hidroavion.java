package com.softtek.ejercicioVolador.model;

public class Hidroavion extends Avion implements Nautico{
    @Override
    public String atracar() { return "Atracar"; }

    @Override
    public String navegar() { return "Navegar"; }
}
