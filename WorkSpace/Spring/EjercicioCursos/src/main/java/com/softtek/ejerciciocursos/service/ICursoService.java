package com.softtek.ejerciciocursos.service;

import com.softtek.ejerciciocursos.model.Curso;

import java.util.List;

public interface ICursoService {
    List<Curso> listCursos();
    Curso findCurso(int idCurso);
    Curso insertCurso(Curso c);
    Curso updateCurso(Curso c);
    void deleteCurso(int idCurso);
}
