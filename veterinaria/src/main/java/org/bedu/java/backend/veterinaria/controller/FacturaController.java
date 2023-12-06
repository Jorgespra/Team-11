package org.bedu.java.backend.veterinaria.controller;

import java.util.List;

import org.bedu.java.backend.veterinaria.dto.CreateFacturaDTO;
import org.bedu.java.backend.veterinaria.dto.FacturaDTO;
import org.bedu.java.backend.veterinaria.dto.FacturaMedicamentoDTO;
import org.bedu.java.backend.veterinaria.service.FacturaMedicamentoService;
import org.bedu.java.backend.veterinaria.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
// import lombok.extern.slf4j.Slf4j;

@RestController
// @Slf4j
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    // private FacturaService facturaService;
    private FacturaService service;

    @Autowired
    private FacturaMedicamentoService fMedicamento;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<FacturaDTO> findAll() {
        return service.findAll();
        // public List<FacturaDTO> getAll() {
        // return facturaService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FacturaDTO save(@Valid @RequestBody CreateFacturaDTO data) {
        return service.save(data);
    }

    @PostMapping("{facturaId}/medicamento")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addMedicamentoFactura(@PathVariable(name = "facturaId") long facturaId, @RequestBody FacturaMedicamentoDTO data) {
        fMedicamento.addMedicamento(facturaId, data.getMedicamentoId());
    }

}