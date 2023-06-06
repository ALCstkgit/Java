package com.example.peliculaspruebasmock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPelicula")
    private int id;
    @Column(name = "sinopsis")
    private String sinopsis;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "clasificacion")
    private double clasificacion;
    @Column(name = "url")
    private String url;
}
