package com.softtek.ejercicioTaller.model;

public class TallerMecanica implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "Coche "+c.getModelo()+" con matricula "+c.getMatricula()+" arreglado";
    }
}
