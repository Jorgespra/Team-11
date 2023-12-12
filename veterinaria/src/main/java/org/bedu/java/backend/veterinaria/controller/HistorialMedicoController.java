package org.bedu.java.backend.veterinaria.controller;

import org.bedu.java.backend.veterinaria.dto.HistorialMedicoDto;
import org.bedu.java.backend.veterinaria.exception.HistorialMedicoNotFoundException;
import org.bedu.java.backend.veterinaria.service.HistorialMedicoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import java.util.List;
@Tag(name = "Historiales Médicos", description = "Operaciones relacionadas con historiales médicos CRUD")
@RestController
@AllArgsConstructor
@RequestMapping("veterinaria/historiales")
public class HistorialMedicoController {
    private final HistorialMedicoService historialMedicoService;

    @PostMapping
    @Operation(summary = "Crear un nuevo historial médico")
    @ResponseStatus(HttpStatus.CREATED)
    public HistorialMedicoDto createHistorialMedico(@Valid @RequestBody HistorialMedicoDto historialMedico) throws HistorialMedicoNotFoundException {
        return historialMedicoService.createHistorialMedico(historialMedico);
    }

    @GetMapping("{id}")
    @Operation(summary = "Obtener un historial médico por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Historial médico encontrado"),
            @ApiResponse(responseCode = "404", description = "Historial médico no encontrado")
    })
    public ResponseEntity<HistorialMedicoDto> getHistorialMedicoById(
        @Parameter(description = "ID del historial médico", required = true)
        @PathVariable("id") Long historialMedicoId) throws HistorialMedicoNotFoundException {
        HistorialMedicoDto historial = historialMedicoService.getHistorialMedicoById(historialMedicoId);
        return new ResponseEntity<>(historial, HttpStatus.OK);
    }

    @GetMapping
    @Operation(summary = "Obtener todos los historiales médicos")
    @ResponseStatus(HttpStatus.OK)
    public List<HistorialMedicoDto> getAllHistorialMedico() {
        return historialMedicoService.getAllHistorialMedico();
    }

    @GetMapping("/mascota/{mascotaId}")
    @Operation(summary = "Obtener historiales médicos por relación con mascota")
    @ResponseStatus(HttpStatus.OK)
    public List<HistorialMedicoDto> getHistorialesByMascotaId(
        @Parameter(description = "ID de la mascota", required = true)
        @PathVariable("mascotaId") Long mascotaId) {
        return historialMedicoService.getHistorialesByMascotaId(mascotaId);
    }

    @GetMapping("/veterinario/{veterinarioId}")
    @Operation(summary = "Obtener historiales médicos por búsqueda de veterinario")
    @ResponseStatus(HttpStatus.OK)
    public List<HistorialMedicoDto> getHistorialesByVeterinarioId(
        @Parameter(description = "ID del veterinario", required = true)
        @PathVariable("veterinarioId") Long veterinarioId) {
        return historialMedicoService.getHistorialesByVeterinarioId(veterinarioId);
    }

    @PutMapping("{id}")
    @Operation(summary = "Actualizar un historial médico")
    @ResponseStatus(HttpStatus.OK)
    public HistorialMedicoDto updateHistorialMedico(
        @Parameter(description = "ID del historial médico", required = true)
        @PathVariable("id") Long historialMedicoId, @RequestBody @Valid HistorialMedicoDto historialMedico) throws HistorialMedicoNotFoundException {
        historialMedico.setId(historialMedicoId);
        return historialMedicoService.updateHistorialMedico(historialMedico);
    }

    @DeleteMapping("{id}")
    @Operation(summary = "Eliminar un historial médico, buscándolo por su ID")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteHistorialMedico(
        @Parameter(description = "ID del historial médico", required = true)
        @PathVariable("id") Long historialMedicoId) {
        historialMedicoService.deleteHistorialMedico(historialMedicoId);
        return new ResponseEntity<>("Historial borrado exitosamente", HttpStatus.OK);
    }
}