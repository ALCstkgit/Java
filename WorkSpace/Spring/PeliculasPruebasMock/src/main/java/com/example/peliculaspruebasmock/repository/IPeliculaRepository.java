package com.example.peliculaspruebasmock.repository;

import com.example.peliculaspruebasmock.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPeliculaRepository extends JpaRepository<Pelicula,Integer> {
}
