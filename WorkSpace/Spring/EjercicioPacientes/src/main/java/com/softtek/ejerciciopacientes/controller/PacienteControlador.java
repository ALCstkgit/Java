package com.softtek.ejerciciopacientes.controller;

import com.softtek.ejerciciopacientes.model.Paciente;
import com.softtek.ejerciciopacientes.service.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteControlador {
    @Autowired
    private IPacienteServicio p;

    @GetMapping
    public String obtenerUno(){
        Paciente p1 = new Paciente(1,"Juan",30);
        return p.obtenerUno(p1);
    }
}
