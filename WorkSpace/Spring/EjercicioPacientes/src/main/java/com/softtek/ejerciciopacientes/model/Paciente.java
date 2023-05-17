package com.softtek.ejerciciopacientes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    private int idPaciente;
    private String nombre;
    private int edad;
}
