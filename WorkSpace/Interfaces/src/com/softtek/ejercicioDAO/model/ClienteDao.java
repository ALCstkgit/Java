package com.softtek.ejercicioDAO.model;

public class ClienteDao {
    private IDao conexion;

    public ClienteDao(IDao conexion){
        this.conexion = conexion;
    }

    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }
}
