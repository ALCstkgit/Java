package com.softtek.ejercicioConducir.model;

public class Conductor {
    private IVehiculo v;

    public Conductor(IVehiculo v){
        this.v = v;
    }

    public String conducir() {
        return v.moverse();
    }
}
