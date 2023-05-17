package com.softtek.ejercicioVolador.model;

public class Superman extends Kriptoniano implements ObjetoVolador{
    @Override
    public String despegar() {
        return "Despegando";
    }
    @Override
    public String aterrizar() {
        return "Aterrizando";
    }
    @Override
    public String volar() {
        return "Volando";
    }
    @Override
    public String comer() {
        return "Comer";
    }
    public String saltarEdificio(){
        return "Saltar Edificio";
    }
    public String detenerBala(){
        return "Detener Bala";
    }
}
