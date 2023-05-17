package com.softtek.fundamentosspring.modelTaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SeguroCoche {
    @Autowired
    @Qualifier("tp")
    private ITaller taller;
    private String aseguradora;

    public SeguroCoche(ITaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public SeguroCoche(){
        this.aseguradora = "prueba";
    }

    public String reparar(CocheTaller c){
        return "Aseguradora "+aseguradora+" "+this.taller.reparar(c);
    }
}
