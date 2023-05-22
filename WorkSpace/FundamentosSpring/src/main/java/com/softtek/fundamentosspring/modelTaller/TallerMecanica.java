package com.softtek.fundamentosspring.modelTaller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tm")
public class TallerMecanica implements ITaller{
    @Override
    public String reparar(CocheTaller c) {
        return "Coche "+c.getModelo()+" con matricula "+c.getMatricula()+" arreglado";
    }
}
