package com.softtek.ejercicioConducir.model;

public class Coche implements IVehiculo{
    private int deposito;

    public Coche(int deposito){
        this.deposito = deposito;
    }
    public void setDeposito(int n){
        this.deposito = n;
    }
    @Override
    public String moverse() {
        return this.deposito > 0 ? "Coche se mueve" : "Deposito vacio";
    }
}
