package com.softtek.ejerciciocursos.service;

import com.softtek.ejerciciocursos.model.Curso;
import com.softtek.ejerciciocursos.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements ICursoService{
    @Autowired
    ICursoRepository cr;

    @Override
    public List<Curso> listCursos() {
        return cr.listCursos();
    }

    @Override
    public Curso findCurso(int idCurso) {
        return cr.findCurso(idCurso);
    }

    @Override
    public Curso insertCurso(Curso c) {
        return cr.insertCurso(c);
    }

    @Override
    public Curso updateCurso(Curso c) {
        return cr.updateCurso(c);
    }

    @Override
    public void deleteCurso(int idCurso) {
        cr.deleteCurso(idCurso);
    }
}
