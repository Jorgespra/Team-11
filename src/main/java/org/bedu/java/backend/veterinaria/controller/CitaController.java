package org.bedu.java.backend.veterinaria.controller;


import jakarta.validation.Valid;
import org.bedu.java.backend.veterinaria.dto.CitaDTO;
import org.bedu.java.backend.veterinaria.dto.CreateCitaDTO;
import org.bedu.java.backend.veterinaria.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cita")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CitaDTO> findAll(){
        return citaService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CitaDTO save (@Valid @RequestBody CreateCitaDTO data) {
        return citaService.save(data);

    }


}
