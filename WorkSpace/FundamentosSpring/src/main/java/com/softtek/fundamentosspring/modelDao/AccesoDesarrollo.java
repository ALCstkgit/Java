package com.softtek.fundamentosspring.modelDao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("accesDes")
public class AccesoDesarrollo implements IDao{
    @Override
    public String insertar(Cliente c1) {
        return "Cliente Insertado Desarrollo";
    }
}
