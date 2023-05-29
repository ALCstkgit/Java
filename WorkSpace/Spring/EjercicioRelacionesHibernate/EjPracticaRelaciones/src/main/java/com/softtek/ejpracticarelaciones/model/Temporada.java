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
@Table(name = "temporadas")
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int inicio;
    private int fin;
    @ManyToMany(cascade = {
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.ALL
    })
    @JoinTable(
            name="temporadas_pilotos",
            joinColumns = {@JoinColumn(name = "temporadas.id")},
            inverseJoinColumns = {@JoinColumn(name = "pilotos.id")}
    )
    private Set<Piloto> pilotos;
}
