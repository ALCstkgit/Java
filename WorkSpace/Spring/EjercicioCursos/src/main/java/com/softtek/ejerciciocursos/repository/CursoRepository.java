package com.softtek.ejerciciocursos.repository;

import com.softtek.ejerciciocursos.model.Curso;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CursoRepository implements ICursoRepository{
    List<Curso> cursos = new ArrayList<>();
    @Override
    public List<Curso> listCursos() {
        return cursos;
    }

    @Override
    public Curso findCurso(int idCurso) {
        return cursos.stream().filter(c->c.getIdCurso()==idCurso).findFirst().orElse(null);
    }

    @Override
    public Curso insertCurso(Curso c) {
        cursos.add(c);
        return c;
    }

    @Override
    public Curso updateCurso(Curso c) {
        return cursos.set(cursos.indexOf(findCurso(c.getIdCurso())),c);
    }

    @Override
    public void deleteCurso(int idCurso) {
        cursos.removeIf(c->c.getIdCurso() == idCurso);
    }
}
