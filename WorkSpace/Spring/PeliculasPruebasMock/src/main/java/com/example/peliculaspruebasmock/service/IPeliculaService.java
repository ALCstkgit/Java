package com.example.peliculaspruebasmock.service;

import com.example.peliculaspruebasmock.model.Pelicula;

import java.util.List;
import java.util.Optional;

public interface IPeliculaService {
    List<Pelicula> listPeliculas();
    Pelicula findPelicula(int id);
    Pelicula insertPelicula(Pelicula p);
}
