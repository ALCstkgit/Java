package com.softtek.ejpracticarelaciones.service;

import com.softtek.ejpracticarelaciones.model.Telefono;
import com.softtek.ejpracticarelaciones.repository.IPilotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TelefonoService implements ITelefonoService {
    @Autowired
    IPilotoRepository pr;

    @Override
    public Set<Telefono> listTelefonosPiloto(String nombre) {
        return pr.findPilotoByNombre(nombre).getTelefonos();
    }
}
