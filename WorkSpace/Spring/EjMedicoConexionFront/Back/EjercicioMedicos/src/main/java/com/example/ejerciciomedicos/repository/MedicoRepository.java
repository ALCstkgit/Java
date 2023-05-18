package com.example.ejerciciomedicos.repository;

import com.example.ejerciciomedicos.model.Medico;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class MedicoRepository implements IMedicoRepository{
    private List<Medico> medicos = new ArrayList<Medico>(Arrays.asList(
            new Medico(1,"423r23fwdf", "Juan", 40),
            new Medico(2,"gergwdf", "Sara", 50),
            new Medico(3,"435345f", "Petyr", 30),
            new Medico(4,"54645dfg", "Laura", 45)
    ));
    @Override
    public List<Medico> listMedico() {
        return medicos;
    }
}
