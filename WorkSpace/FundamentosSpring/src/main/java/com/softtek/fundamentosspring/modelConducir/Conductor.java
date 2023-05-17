package com.softtek.fundamentosspring.modelConducir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Conductor {
    @Autowired
    private IVehiculo v;

    public Conductor(){
    }
    public String conducir() {
        return v.moverse();
    }

    public void setV(IVehiculo v) {
        this.v = v;
    }
    public IVehiculo getV() {
        return v;
    }
}
