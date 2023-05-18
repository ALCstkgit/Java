package com.example.ejerciciomedicos.repository;

import com.example.ejerciciomedicos.model.Medico;
import org.springframework.stereotype.Repository;

@Repository
public class MedicoRepository implements IMedicoRepository{
    Medico[] medicos = {
            new Medico(1,"423r23fwdf", "Juan", 40),
            new Medico(2,"gergwdf", "Sara", 50),
            new Medico(3,"435345f", "Petyr", 30),
            new Medico(4,"54645dfg", "Laura", 45)
    };

    @Override
    public Medico[] listMedico() {
        return medicos;
    }
}
