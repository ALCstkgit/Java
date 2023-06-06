package com.example.peliculaspruebasmock.controller;

import com.example.peliculaspruebasmock.model.Pelicula;
import com.example.peliculaspruebasmock.service.IPeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
    @Autowired
    IPeliculaService peliculaService;

    @GetMapping
    public ResponseEntity<List<Pelicula>> listPeliculas(){
        return new ResponseEntity<>(peliculaService.listPeliculas(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public EntityModel<Pelicula> findPelicula(@PathVariable int id){
        Pelicula p = peliculaService.findPelicula(id);
        WebMvcLinkBuilder link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findPelicula(id));
        return EntityModel.of(p).add(link.withRel("pel-link"));
    }
    @PostMapping
    public ResponseEntity<Void> insertPelicula(@RequestBody Pelicula p){
        Pelicula pel = peliculaService.insertPelicula(p);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pel.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}