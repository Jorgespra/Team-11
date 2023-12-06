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

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("veterinaria/historiales")
public class HistorialMedicoController {

    private HistorialMedicoService historialMedicoService;


    @Transactional
    @PostMapping
    public ResponseEntity<HistorialMedicoDto> createHistorialMedico(@Valid @RequestBody HistorialMedicoDto historialMedico){
        HistorialMedicoDto savedHistorialMedico = historialMedicoService.createHistorialMedico(historialMedico);
        return new ResponseEntity<>(savedHistorialMedico, HttpStatus.CREATED);
    }

     @GetMapping("{id}")
    public ResponseEntity<HistorialMedicoDto> getHistorialMedicoById(@PathVariable("id") Long historialMedicoId){
        HistorialMedicoDto historial = historialMedicoService.getHistorialMedicoById(historialMedicoId);
        return new ResponseEntity<>(historial, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<HistorialMedicoDto>> getAllHistorialMedico(){
        List<HistorialMedicoDto> historiales = historialMedicoService.getAllHistorialMedico();
        return new ResponseEntity<>(historiales, HttpStatus.OK);
    }

     @PutMapping("{id}")
    public ResponseEntity<HistorialMedicoDto> updateHistorialMedico(@PathVariable("id") Long historialMedicoId, @RequestBody @Valid HistorialMedicoDto historialMedico){
        historialMedico.setId(historialMedicoId);
        HistorialMedicoDto updateHistorialMedico = historialMedicoService.updateHistorialMedico(historialMedico);
        return new ResponseEntity<>(updateHistorialMedico, HttpStatus.OK);
    }

     @DeleteMapping("{id}")
    public ResponseEntity<String> deleteHistorialMedico(@PathVariable("id") Long historialMedicoId){
        historialMedicoService.deleteHistorialMedico(historialMedicoId);
        return new ResponseEntity<>("Historial borrado exitosamente", HttpStatus.OK);
    }

}
