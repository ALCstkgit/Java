package com.softtek.ejpracticarelaciones.service;

import com.softtek.ejpracticarelaciones.model.Piloto;

import java.util.Set;

public interface IPilotoService {
    Set<Piloto> findPilotosTemp(long id);
    Set<Piloto> findPilotosEsc(long id);
    Set<Piloto> findPilotosMas1Cifra();
    Set<Piloto> listPilotoDosValores(int val1, int val2);
    Set<Piloto> listPilotosNoItalianos();
    void insertPiloto(Piloto piloto);
}
