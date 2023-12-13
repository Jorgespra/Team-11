package org.bedu.java.backend.veterinaria.controller;

import java.util.List;
import org.bedu.java.backend.veterinaria.dto.CreateFacturaDTO;
import org.bedu.java.backend.veterinaria.dto.FacturaDTO;
import org.bedu.java.backend.veterinaria.dto.FacturaMedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.MedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateFacturaDTO;
import org.bedu.java.backend.veterinaria.exception.FacturaNotFound;
import org.bedu.java.backend.veterinaria.service.FacturaMedicamentoService;
import org.bedu.java.backend.veterinaria.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @Autowired
    private FacturaMedicamentoService fMedicamentoService;

    @Operation(summary = "Obtiene la lista de todas las facturas")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<FacturaDTO> findAll() {
        return service.findAll();
        // public List<FacturaDTO> getAll() {
        // return facturaService.getAll();
    }

    @Operation(summary = "Registra una factura")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FacturaDTO save(@Valid @RequestBody CreateFacturaDTO data) {
        return service.save(data);
    }

    @Operation(summary = "Relaciona una factura con un medicamento")
    @PostMapping("{facturaId}/medicamento")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addMedicamentoFactura(@PathVariable(name = "facturaId") long facturaId,
            @RequestBody FacturaMedicamentoDTO data) {
        fMedicamento.addMedicamento(facturaId, data.getMedicamentoId(), data.getPrecio(), data.getCantidad());
    }

    @Operation(summary = "Obtiene los medicamentos de una factura")
    @GetMapping("{facturaId}/medicamentos")
    @ResponseStatus(HttpStatus.OK)
    public List<MedicamentoDTO> findMedicamentoByFactura(@PathVariable(name = "facturaId") long facturaId) {
        return fMedicamentoService.findMedicamentoByFactura(facturaId);
    }

    @Operation(summary = "Actualiza una factura")
    @PutMapping("{facturaId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable(name = "facturaId") long facturaId, @RequestBody UpdateFacturaDTO data)
            throws FacturaNotFound {
        service.update(facturaId, data);
    }

    @Operation(summary = "Elimina una factura")
    @DeleteMapping("{facturaId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(name = "facturaId") long facturaId) {
        service.deleteById(facturaId);
    }

}