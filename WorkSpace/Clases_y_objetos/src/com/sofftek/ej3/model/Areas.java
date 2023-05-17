package com.sofftek.ej3.model;

public class Areas {
    public double areaRectangulo(double base, double altura){
        return base * altura;
    }

    public double areaCirculo(double radio){
        return Math.PI * Math.pow(radio,2);
    }
}
