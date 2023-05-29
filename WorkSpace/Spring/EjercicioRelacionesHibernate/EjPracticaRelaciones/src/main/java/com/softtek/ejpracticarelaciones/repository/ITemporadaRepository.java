package com.softtek.ejpracticarelaciones.repository;

import com.softtek.ejpracticarelaciones.model.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITemporadaRepository extends JpaRepository<Temporada, Long> {
    Temporada findTemporadaById(long id);
}
