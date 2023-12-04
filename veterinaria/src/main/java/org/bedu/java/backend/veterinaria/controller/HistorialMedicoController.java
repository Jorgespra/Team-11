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

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("veterinaria/historiales")
public class HistorialMedicoController {
    /* 
    private final HistorialMedicoService historialMedicoService;

    
     * El constructor está destinado a asegurar que un objeto HistorialMedicoController siempre tenga acceso 
     * a un objeto HistorialMedicoService válido cuando se crea, utilizando el principio de inyección de dependencias 
     * para proporcionar esa dependencia.
     
    public HistorialMedicoController(HistorialMedicoService historialMedicoService) {
        this.historialMedicoService = historialMedicoService;
    }

    // Endpoint para obtener todos los historiales médicos
    @GetMapping 
    public ResponseEntity<List<HistorialMedico>> obtenerTodosHistoriales() {
        List<HistorialMedico> historiales = historialMedicoService.obtenerTodosHistoriales();
        return new ResponseEntity<>(historiales, HttpStatus.OK);
    }

    // Endpoint para obtener un historial médico por ID
    @GetMapping("/{id}")
    public ResponseEntity<HistorialMedico> obtenerHistorialPorId(@PathVariable long id) {
        HistorialMedico historial = historialMedicoService.obtenerHistorialPorId(id);
        if (historial != null) {
            return new ResponseEntity<>(historial, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para crear un nuevo historial médico
    @PostMapping 
    public ResponseEntity<HistorialMedico> crearHistorial(@Valid @RequestBody HistorialMedico historial) {
        HistorialMedico nuevoHistorial = historialMedicoService.crearHistorial(historial);
        return new ResponseEntity<>(nuevoHistorial, HttpStatus.CREATED);
    }

    // Endpoint para actualizar un historial médico existente
    @PutMapping("/{id}") 
    public ResponseEntity<HistorialMedico> actualizarHistorial(@PathVariable long id, @Valid @RequestBody HistorialMedico historial) {
        HistorialMedico historialActualizado = historialMedicoService.actualizarHistorial(id, historial);
        if (historialActualizado != null) {
            return new ResponseEntity<>(historialActualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para eliminar un historial médico por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarHistorial(@PathVariable long id) {
        if (historialMedicoService.eliminarHistorial(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    */
    
    private HistorialMedicoService historialMedicoService;

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
