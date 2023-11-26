package org.bedu.java.backend.veterinaria.controller;

import java.util.List;

import org.bedu.java.backend.veterinaria.dto.CreatePacienteDTO;
import org.bedu.java.backend.veterinaria.dto.PacienteDTO;
import org.bedu.java.backend.veterinaria.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class PacienteController {
    
    @Autowired
    private PacienteService pacienteService;

    @RequestMapping("/obtenerPaciente")
    public List<PacienteDTO> getAll() {
        return pacienteService.getAll();
    }

    @RequestMapping("/crearPaciente")
    public PacienteDTO save(@Valid @RequestBody CreatePacienteDTO data) {
        return pacienteService.save(data);
    }

}
