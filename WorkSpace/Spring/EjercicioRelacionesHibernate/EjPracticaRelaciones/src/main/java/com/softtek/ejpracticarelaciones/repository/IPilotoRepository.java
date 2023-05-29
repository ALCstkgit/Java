package com.softtek.ejpracticarelaciones.repository;

import com.softtek.ejpracticarelaciones.model.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface IPilotoRepository extends JpaRepository<Piloto, Long> {
    Piloto findPilotoByNombre(String nombre);

    @Query(value = "FROM Piloto p WHERE p.facturacion.sueldo > 9")
    Set<Piloto> listPilotoMasCifras();

    @Query(value = "FROM Piloto p WHERE p.facturacion.publicidad > :val1 AND p.facturacion.publicidad < :val2")
    Set<Piloto> listPilotoDosValores(int val1, int val2);

    @Query(value = "FROM Piloto p WHERE p.escuderia.pais != 'Italia'")
    Set<Piloto> listPilotosNoItalianos();
}
