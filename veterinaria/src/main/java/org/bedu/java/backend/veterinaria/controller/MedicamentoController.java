package org.bedu.java.backend.veterinaria.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.bedu.java.backend.veterinaria.dto.CreateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.MedicamentoDTO;
import org.bedu.java.backend.veterinaria.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MedicamentoDTO> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MedicamentoDTO save(@Valid @RequestBody CreateMedicamentoDTO data) {
        log.info("Ejecutando guardado de un medicamento...");
        log.info(data.toString());
        return service.save(data);
    }

}