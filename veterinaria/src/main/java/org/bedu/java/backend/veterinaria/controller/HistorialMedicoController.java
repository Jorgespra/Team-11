package org.bedu.java.backend.veterinaria.controller;

import org.bedu.java.backend.veterinaria.model.HistorialMedico;
import org.bedu.java.backend.veterinaria.service.HistorialMedicoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/historiales")
public class HistorialMedicoController {

    private final HistorialMedicoService historialMedicoService;

    /*
     * El constructor está destinado a asegurar que un objeto HistorialMedicoController siempre tenga acceso 
     * a un objeto HistorialMedicoService válido cuando se crea, utilizando el principio de inyección de dependencias 
     * para proporcionar esa dependencia.
     */
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
}
