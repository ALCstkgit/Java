package com.sofftek.ej1.model;

public class PlantaTropical extends Planta{
    private int altura;
    public PlantaTropical(int petalos, int altura){
        super.petalos = petalos;
        this.altura = altura;
    }
    public PlantaTropical(){
        super.petalos = 0;
        this.altura = 0;
    }
    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Planta regada con "+cantidad+" durante "+tiempo+" planta tropical");
    }
}
