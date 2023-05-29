package com.softtek.ejpracticarelaciones.repository;

import com.softtek.ejpracticarelaciones.model.Escuderia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEscuderiaRepository extends JpaRepository<Escuderia,Long> {
    Escuderia findEscuderiaById(long id);
}
