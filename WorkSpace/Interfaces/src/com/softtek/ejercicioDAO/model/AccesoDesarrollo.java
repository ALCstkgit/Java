package com.softtek.ejercicioDAO.model;

public class AccesoDesarrollo implements IDao{
    @Override
    public String insertar(Cliente c1) {
        return "Cliente Insertado Desarrollo";
    }
}
