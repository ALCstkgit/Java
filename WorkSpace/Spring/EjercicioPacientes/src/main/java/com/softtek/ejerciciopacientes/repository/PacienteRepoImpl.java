package com.softtek.ejerciciopacientes.repository;

import com.softtek.ejerciciopacientes.model.Paciente;
import org.springframework.stereotype.Repository;

@Repository
public class PacienteRepoImpl implements IPacienteRepo{
    @Override
    public String obtenerUno(Paciente p1) {
        return p1.toString();
    }
}
