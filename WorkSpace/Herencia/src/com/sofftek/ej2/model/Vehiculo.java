package com.sofftek.ej2.model;

public class Vehiculo {
    private int velocidad;
    private int velMaxima;

    public Vehiculo(int velocidad, int velMaxima){
        this.velocidad = velocidad;
        this.velMaxima = velMaxima;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }

    public void acelerar(int num){
        velocidad = (velocidad + num)>velMaxima?velMaxima:(velocidad+num);
    }
    public void decelerar(int num){
        velocidad = (velocidad - num)<0?0:(velocidad - num);
    }
    public void frenar(){
        velocidad = 0;
        System.out.println("Parado, velocidad = 0");
    }
}
