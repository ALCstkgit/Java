package com.softtek.ejpracticarelaciones.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "escuderias")
public class Escuderia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String pais;
    @OneToMany(mappedBy = "escuderia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Piloto> pilotos;
}
