package com.example.ejerciciomedicos.service;

import com.example.ejerciciomedicos.model.Medico;
import com.example.ejerciciomedicos.repository.IMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService implements IMedicoService{
    @Autowired
    IMedicoRepository mr;

    @Override
    public Medico[] listMedicos() {
        return mr.listMedico();
    }
}
