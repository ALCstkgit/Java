package com.softtek.ejercicioTaller.model;

public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "Coche "+c.getModelo()+" con matricula "+c.getMatricula()+" pintado";
    }
}
