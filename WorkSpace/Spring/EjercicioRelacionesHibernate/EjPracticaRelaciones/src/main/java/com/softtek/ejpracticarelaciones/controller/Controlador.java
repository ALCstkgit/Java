package com.softtek.ejpracticarelaciones.controller;

import com.softtek.ejpracticarelaciones.model.Piloto;
import com.softtek.ejpracticarelaciones.model.Telefono;
import com.softtek.ejpracticarelaciones.service.IPilotoService;
import com.softtek.ejpracticarelaciones.service.ITelefonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Set;

@Controller
public class Controlador {
    @Autowired
    IPilotoService ps;
    @Autowired
    ITelefonoService ts;

    public Set<Piloto> findPilotosTemp(long id){
        return ps.findPilotosTemp(id);
    }
    public Set<Piloto> findPilotosEsc(long id){
        return ps.findPilotosEsc(id);
    }
    public Set<Piloto> findPilotosMas1Cifra(){
        return ps.findPilotosMas1Cifra();
    }
    public Set<Piloto> listPilotoDosValores(int val1, int val2) {
        return ps.listPilotoDosValores(val1,val2);
    }
    public Set<Piloto> listPilotosNoItalianos() {
        return ps.listPilotosNoItalianos();
    }
    public void insertPiloto(Piloto piloto) {
        ps.insertPiloto(piloto);
    }
    public Set<Telefono> listTelefonosPiloto() {
        return ts.listTelefonosPiloto("Alonso");
    }
}
