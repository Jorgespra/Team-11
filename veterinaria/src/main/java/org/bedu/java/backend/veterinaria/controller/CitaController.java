package org.bedu.java.backend.veterinaria.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.bedu.java.backend.veterinaria.dto.CitaDTO;
import org.bedu.java.backend.veterinaria.dto.CreateCitaDTO;
import org.bedu.java.backend.veterinaria.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Endpoints de Citas", description = "CRUD de Citas")
@RestController
@RequestMapping("citas")
public class CitaController {

    @Autowired
    private CitaService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CitaDTO> findAll(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CitaDTO save (@Valid @RequestBody CreateCitaDTO data) {
        return service.save(data);

    }

}
