package com.softtek.ejercicioVolador.model;

public class Ave extends Animal implements ObjetoVolador{
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
    public String hacerNido(){
        return "Hacer Nido";
    }
    public String ponerHuevos(){
        return "Poner Huevos";
    }
}
