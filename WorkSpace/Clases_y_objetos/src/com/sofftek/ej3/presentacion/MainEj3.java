package com.sofftek.ej3.presentacion;

import com.sofftek.ej3.model.Areas;

public class MainEj3 {
    public static void main(String[] args) {
        Areas a = new Areas();
        System.out.println("Area Rectangulo:");
        System.out.println(a.areaRectangulo(2,5));
        System.out.println("---------");
        System.out.println("Area Circulo:");
        System.out.println(a.areaCirculo(3));
    }
}
