package com.softtek.fundamentosspring.modelTaller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tp")
public class TallerPintura implements ITaller{
    @Override
    public String reparar(CocheTaller c) {
        return "Coche "+c.getModelo()+" con matricula "+c.getMatricula()+" pintado";
    }
}
