package com.example.peliculaspruebasmock.service;

import com.example.peliculaspruebasmock.exceptions.ObjectNotFound;
import com.example.peliculaspruebasmock.model.Pelicula;
import com.example.peliculaspruebasmock.repository.IPeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaService implements IPeliculaService{
    @Autowired
    IPeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> listPeliculas() {
        return peliculaRepository.findAll();
    }

    @Override
    public Pelicula findPelicula(int id) {
        return peliculaRepository.findById(id).orElseThrow(() -> new ObjectNotFound("Pelicula noencontrada"));
    }

    @Override
    public Pelicula insertPelicula(Pelicula p) {
        return peliculaRepository.save(p);
    }
}
