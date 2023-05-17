package com.sofftek.ej2.presentacion;

import com.sofftek.ej2.model.Pajaro;
import com.sofftek.ej2.model.Perro;
import com.sofftek.ej2.model.Pez;

public class MainAnimales {
    public static void main(String[] args) {
        Pajaro paj = new Pajaro();
        Pez pez = new Pez();
        Perro perr = new Perro();

        System.out.println("Pajaro:");
        System.out.println(paj.comer());
        System.out.println(paj.moverse());
        System.out.println("Num patas: "+paj.numPatas);
    }
}
