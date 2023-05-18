package com.example.ejerciciomedicos.service;

import com.example.ejerciciomedicos.model.Medico;
import com.example.ejerciciomedicos.repository.IMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService implements IMedicoService{
    @Autowired
    IMedicoRepository mr;

    @Override
    public List<Medico> listMedicos() {
        return mr.listMedico();
    }
}
