package com.softtek.ejpracticarelaciones.service;

import com.softtek.ejpracticarelaciones.model.Telefono;

import java.util.Set;

public interface ITelefonoService {
    Set<Telefono> listTelefonosPiloto(String nombre);
}
