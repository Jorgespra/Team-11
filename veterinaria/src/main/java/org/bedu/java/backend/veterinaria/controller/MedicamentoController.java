package org.bedu.java.backend.veterinaria.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.bedu.java.backend.veterinaria.dto.CreateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.MedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.exception.MedicamentoNotFoundException;
import org.bedu.java.backend.veterinaria.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Tag(name = "Endpoints de Medicamentos", description = "CRUD de medicamentos")
@RestController
@Slf4j
@RequestMapping("medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoService service;

    @Operation(summary = "Obtiene la lista de todos los medicamentos")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MedicamentoDTO> findAll() {
        return service.findAll();
    }

    @Operation(summary = "Crea un nuevo medicamento")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MedicamentoDTO save(@Valid @RequestBody CreateMedicamentoDTO data) {
        log.info("Ejecutando guardado de un medicamento...");
        log.info(data.toString());
        return service.save(data);
    }

    @Operation(summary = "Actualiza la información de un medicamento")
    @PutMapping("{medicamentoId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable long medicamentoId, @Valid @RequestBody UpdateMedicamentoDTO data) throws MedicamentoNotFoundException {
        service.update(medicamentoId, data);
    }

    @Operation(summary = "Elimina un medicamento existente")
    @DeleteMapping("{medicamentoId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable long medicamentoId) throws MedicamentoNotFoundException {
        service.deleteById(medicamentoId);
    }

}