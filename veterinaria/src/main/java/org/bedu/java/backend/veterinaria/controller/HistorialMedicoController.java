package org.bedu.java.backend.veterinaria.controller;

import org.bedu.java.backend.veterinaria.dto.HistorialMedicoDto;
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

    private HistorialMedicoService historialMedicoService;


    @PostMapping
    @Operation(summary = "Crear un nuevo historial médico")
    public ResponseEntity<HistorialMedicoDto> createHistorialMedico(@Valid @RequestBody HistorialMedicoDto historialMedico){
        HistorialMedicoDto savedHistorialMedico = historialMedicoService.createHistorialMedico(historialMedico);
        return new ResponseEntity<>(savedHistorialMedico, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    @Operation(summary = "Obtener un historial médico por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Historial médico encontrado"),
            @ApiResponse(responseCode = "404", description = "Historial médico no encontrado")
    })
    public ResponseEntity<HistorialMedicoDto> getHistorialMedicoById(
        @Parameter(description = "ID del historial médico", required = true)
        @PathVariable("id") Long historialMedicoId){
        HistorialMedicoDto historial = historialMedicoService.getHistorialMedicoById(historialMedicoId);
        return new ResponseEntity<>(historial, HttpStatus.OK);
    }

    @GetMapping
    @Operation(summary = "Obtener todos los historiales médicos")
    public ResponseEntity<List<HistorialMedicoDto>> getAllHistorialMedico(){
        List<HistorialMedicoDto> historiales = historialMedicoService.getAllHistorialMedico();
        return new ResponseEntity<>(historiales, HttpStatus.OK);
    }

    @GetMapping("/mascota/{mascotaId}")
    @Operation(summary = "Obtener historiales médicos por relacion con mascota")
    public ResponseEntity<List<HistorialMedicoDto>> getHistorialesByMascotaId(
        @Parameter(description = "ID de la mascota", required = true)
        @PathVariable("mascotaId") Long mascotaId) {
        List<HistorialMedicoDto> historiales = historialMedicoService.getHistorialesByMascotaId(mascotaId);
        return new ResponseEntity<>(historiales, HttpStatus.OK);
    }

    @GetMapping("/veterinario/{veterinarioId}")
    @Operation(summary = "Obtener historiales médicos por busqueda de veterinario")
    public ResponseEntity<List<HistorialMedicoDto>> getHistorialesByVeterinarioId(
        @Parameter(description = "ID del veterinario", required = true)
        @PathVariable("veterinarioId") Long veterinarioId) {
        List<HistorialMedicoDto> historiales = historialMedicoService.getHistorialesByVeterinarioId(veterinarioId);
        return new ResponseEntity<>(historiales, HttpStatus.OK);
    }


    @PutMapping("{id}")
    @Operation(summary = "Actualizar un historial médico")
    public ResponseEntity<HistorialMedicoDto> updateHistorialMedico(
        @Parameter(description = "ID del historial médico", required = true)
        @PathVariable("id") Long historialMedicoId, @RequestBody @Valid HistorialMedicoDto historialMedico){
        historialMedico.setId(historialMedicoId);
        HistorialMedicoDto updateHistorialMedico = historialMedicoService.updateHistorialMedico(historialMedico);
        return new ResponseEntity<>(updateHistorialMedico, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    @Operation(summary = "Eliminar un historial médico, buscandolo por su ID")
    public ResponseEntity<String> deleteHistorialMedico(
        @Parameter(description = "ID del historial médico", required = true)
        @PathVariable("id") Long historialMedicoId){
        historialMedicoService.deleteHistorialMedico(historialMedicoId);
        return new ResponseEntity<>("Historial borrado exitosamente", HttpStatus.OK);
    }

}
