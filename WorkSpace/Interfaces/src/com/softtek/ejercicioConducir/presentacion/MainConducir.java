package com.softtek.ejercicioConducir.presentacion;

import com.softtek.ejercicioConducir.model.Coche;
import com.softtek.ejercicioConducir.model.Conductor;

public class MainConducir {
    public static void main(String[] args) {
        Coche c = new Coche(5);
        Conductor conductor = new Conductor(c);

        System.out.println(conductor.conducir());
        c.setDeposito(0);
        System.out.println(conductor.conducir());
    }
}
