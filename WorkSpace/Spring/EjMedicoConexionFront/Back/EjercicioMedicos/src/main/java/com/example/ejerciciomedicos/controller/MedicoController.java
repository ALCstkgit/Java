package com.example.ejerciciomedicos.controller;

import com.example.ejerciciomedicos.model.Medico;
import com.example.ejerciciomedicos.service.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    IMedicoService ms;

    @GetMapping
    public Medico[] listMedicos() throws Exception{
        return ms.listMedicos();
    }
}
