package com.softtek.ejerciciopacientes.service;

import com.softtek.ejerciciopacientes.model.Paciente;
import com.softtek.ejerciciopacientes.repository.IPacienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServicio implements IPacienteServicio{
    @Autowired
    private IPacienteRepo p;

    @Override
    public String obtenerUno(Paciente p1) {
        return p.obtenerUno(p1);
    }
}
