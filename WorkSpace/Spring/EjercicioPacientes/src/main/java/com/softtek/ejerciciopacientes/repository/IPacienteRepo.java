package com.softtek.ejerciciopacientes.repository;

import com.softtek.ejerciciopacientes.model.Paciente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface IPacienteRepo {
    List<Paciente>[]pacientes = new List[]{Arrays.asList(
            new Paciente(1, "Juan", 20),
            new Paciente(2, "Laura", 30),
            new Paciente(3, "Pedro", 65)
    )};
    String obtenerUno(Paciente p1);
}
