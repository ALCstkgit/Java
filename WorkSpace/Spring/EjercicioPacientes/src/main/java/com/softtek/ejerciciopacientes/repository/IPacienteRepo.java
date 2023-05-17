package com.softtek.ejerciciopacientes.repository;

import com.softtek.ejerciciopacientes.model.Paciente;

public interface IPacienteRepo {
    Paciente[]pacientes = {new Paciente(1,"Juan",20),
    new Paciente(2,"Laura",30),
    new Paciente(3,"Pedro",65)};
    String obtenerUno(Paciente p1);
}
