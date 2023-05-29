package com.softtek.ejpracticarelaciones.service;

import com.softtek.ejpracticarelaciones.model.Piloto;
import com.softtek.ejpracticarelaciones.repository.IEscuderiaRepository;
import com.softtek.ejpracticarelaciones.repository.IPilotoRepository;
import com.softtek.ejpracticarelaciones.repository.ITemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PilotoService implements IPilotoService{
    @Autowired
    ITemporadaRepository tr;
    @Autowired
    IEscuderiaRepository er;
    @Autowired
    IPilotoRepository pr;

    @Override
    public Set<Piloto> findPilotosTemp(long id) {
        return tr.findTemporadaById(id).getPilotos();
    }

    @Override
    public Set<Piloto> findPilotosEsc(long id) {
        return er.findEscuderiaById(id).getPilotos();
    }

    @Override
    public Set<Piloto> findPilotosMas1Cifra() {
        return pr.listPilotoMasCifras();
    }

    @Override
    public Set<Piloto> listPilotoDosValores(int val1, int val2) {
        return pr.listPilotoDosValores(val1,val2);
    }

    @Override
    public Set<Piloto> listPilotosNoItalianos() {
        return pr.listPilotosNoItalianos();
    }

    @Override
    public void insertPiloto(Piloto piloto) {
        pr.save(piloto);
    }
}
