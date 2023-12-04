package org.bedu.java.backend.veterinaria.controller;

import java.util.List;

import org.bedu.java.backend.veterinaria.dto.CreateMascotaDTO;
import org.bedu.java.backend.veterinaria.dto.MascotaDTO;
import org.bedu.java.backend.veterinaria.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
// import lombok.extern.slf4j.Slf4j;

@RestController
// @Slf4j
@RequestMapping("/mascotas")
public class MascotaController {
    
    @Autowired
    // private MascotaService mascotaService;
    private MascotaService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MascotaDTO> findAll() {
        return service.findAll();
    // public List<MascotaDTO> getAll() {
    //     return mascotaService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MascotaDTO save(@Valid @RequestBody CreateMascotaDTO data) {
        return service.save(data);
    }


/*     public MascotaDTO save(@Valid @RequestBody CreateMascotaDTO data) {
        log.info("Ejecutando guardado de una mascota");
        log.info(data.toString());
        return mascotaService.save(data);
    }
 */}
