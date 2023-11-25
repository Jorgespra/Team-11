package org.bedu.java.backend.veterinaria.controller;

import org.bedu.java.backend.veterinaria.model.Medicamento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@RequestMapping("medicamento")
public class MedicamentoController {

    @GetMapping("/{medicamentoId}")
    public ResponseEntity<Medicamento> getMedicamento(@PathVariable Long medicamentoId) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<Medicamento>> getMedicamentos() {
        return null;
    }

    @PostMapping
    public ResponseEntity<Void> creaMedicamento(@RequestBody Medicamento medicamento) {
        return null;
    }

    @PutMapping("/{medicamentoId}")
    public ResponseEntity<Void> actualizaMedicamento(@PathVariable Long medicamentoId, @RequestBody Medicamento medicamento) {
        return null;
    }

    @DeleteMapping("/{medicamentoId}")
    public ResponseEntity<Void> eliminaMedicamento(@PathVariable Long medicamentoId) {
        return null;
    }
}
