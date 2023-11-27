package org.bedu.java.backend.veterinaria.controller;

import java.util.List;

import org.bedu.java.backend.veterinaria.dto.CreateMascotaDTO;
import org.bedu.java.backend.veterinaria.dto.MascotaDTO;
import org.bedu.java.backend.veterinaria.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class MascotaController {
    
    @Autowired
    private MascotaService mascotaService;

    @RequestMapping("/obtenerMascota")
    public List<MascotaDTO> getAll() {
        return mascotaService.getAll();
    }

    @RequestMapping("/crearMascota")
    public MascotaDTO save(@Valid @RequestBody CreateMascotaDTO data) {
        return mascotaService.save(data);
    }

}
