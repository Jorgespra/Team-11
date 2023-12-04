package org.bedu.java.backend.veterinaria.controller;


import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.bedu.java.backend.veterinaria.dto.CreateVeterinarioDTO;
import org.bedu.java.backend.veterinaria.dto.VeterinarioDTO;
import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.bedu.java.backend.veterinaria.service.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("veterinarios")
public class VeterinarioController {
    @Autowired
    private VeterinarioService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<VeterinarioDTO> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VeterinarioDTO save(@Valid @RequestBody CreateVeterinarioDTO data) {
        log.info("Ejecutando guardado de un veterinario ...");
        log.info(data.toString());
        return service.save(data);
    }
}
