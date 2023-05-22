package com.softtek.ejerciciocursos.controller;

import com.softtek.ejerciciocursos.exceptions.NoSuchElementFoundException;
import com.softtek.ejerciciocursos.model.Curso;
import com.softtek.ejerciciocursos.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    ICursoService cs;

    @GetMapping
    public ResponseEntity<List<Curso>> listCursos(){
        return new ResponseEntity<>(cs.listCursos(), HttpStatus.OK);
    }

    @GetMapping("/{idCurso}")
    public ResponseEntity<Curso> findCurso(@PathVariable int idCurso){
        Curso c = cs.findCurso(idCurso);
        if(c == null) throw new NoSuchElementFoundException("No se encontro curso con id "+idCurso);
        return new ResponseEntity<>(cs.findCurso(idCurso),HttpStatus.OK);
    }

    @GetMapping("/hateoas/{id}")
    public EntityModel<Curso> findCuros(@PathVariable("id") int id){
        Curso resultBBDD = cs.findCurso(id);
        if(resultBBDD == null) throw new NoSuchElementFoundException("No se encontro curso con id "+id);
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).findCurso(id));
        return EntityModel.of(resultBBDD).add(link.withRel("curso-link"));
    }

    @PostMapping
    public ResponseEntity<Void> insertCurso(@RequestBody Curso c) {
        Curso cur = cs.insertCurso(c);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{idCurso}")
                .buildAndExpand(cur.getIdCurso())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public ResponseEntity<Curso> updateCurso(@RequestBody Curso c) {
        return cs.findCurso(c.getIdCurso())!=null?
                new ResponseEntity<>(cs.updateCurso(c),HttpStatus.ACCEPTED):null;
    }

    @DeleteMapping("/{idCurso}")
    public ResponseEntity<Void> deleteCurso(@PathVariable int idCurso) {
        if(cs.findCurso(idCurso)!=null)cs.deleteCurso(idCurso);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
