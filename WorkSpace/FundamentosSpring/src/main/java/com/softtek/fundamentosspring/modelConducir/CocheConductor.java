package com.softtek.fundamentosspring.modelConducir;

import org.springframework.stereotype.Component;

@Component
public class CocheConductor implements IVehiculo{
    private int deposito;
    public CocheConductor(){
        this.deposito = 20;
    }
    public CocheConductor(int deposito){
        this.deposito = deposito;
    }
    public void setDeposito(int n){
        this.deposito = n;
    }
    @Override
    public String moverse() {
        return this.deposito > 0 ? "Coche se mueve, deposito "+deposito : "Deposito vacio";
    }
}
