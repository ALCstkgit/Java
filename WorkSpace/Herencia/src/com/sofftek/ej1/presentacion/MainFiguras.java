package com.sofftek.ej1.presentacion;

import com.sofftek.ej1.model.Circulo;
import com.sofftek.ej1.model.Rectangulo;

public class MainFiguras {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(3,2,20.5,12.0);
        Circulo c = new Circulo(1,7,22.0);

        System.out.println("Rectangulo:");
        System.out.println(r.posicion());
        System.out.println();
        System.out.println("Circulo");
        System.out.println(c.posicion());
    }
}
