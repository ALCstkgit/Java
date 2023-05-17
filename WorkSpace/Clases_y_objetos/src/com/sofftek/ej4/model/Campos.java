package com.sofftek.ej4.model;

public class Campos {
    private int x;
    public Campos(int x){
        this.x = x;
    }
    public int mostrar(){
        return x;
    }
    public void incrementar(int x){
        this.x += x;
    }
}
