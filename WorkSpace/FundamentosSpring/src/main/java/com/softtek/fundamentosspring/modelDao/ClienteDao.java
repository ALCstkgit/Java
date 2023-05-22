package com.softtek.fundamentosspring.modelDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClienteDao {
    @Autowired
    @Qualifier("accesProd")
    private IDao conexion;

    public ClienteDao(IDao conexion){
        this.conexion = conexion;
    }
    public ClienteDao(){
        this.conexion = null;
    }

    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }
}
