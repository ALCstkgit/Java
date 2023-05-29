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
@Table(name = "pilotos")
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int edad;
    @OneToOne(mappedBy = "piloto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Facturacion facturacion;
    @OneToOne(mappedBy = "piloto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Nif nif;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "escuderia")
    private Escuderia escuderia;
    @OneToMany(mappedBy = "piloto", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Telefono> telefonos;
    @ManyToMany(mappedBy = "pilotos", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Temporada> temporadas;
}
