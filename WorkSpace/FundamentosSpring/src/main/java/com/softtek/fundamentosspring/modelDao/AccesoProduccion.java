package com.softtek.fundamentosspring.modelDao;

import org.springframework.stereotype.Component;

@Component
public class AccesoProduccion implements IDao{
    @Override
    public String insertar(Cliente c1) {
        return "Cliente Insertado Produccion";
    }
}
