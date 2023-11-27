package org.bedu.java.backend.veterinaria.controller.facturas;

import java.util.List;

import org.bedu.java.backend.veterinaria.dto.facturas.CreatefacturasDTO;
import org.bedu.java.backend.veterinaria.dto.facturas.FacturaDTO;
import org.bedu.java.backend.veterinaria.service.facturas.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class FacturaController {
    @Autowired
    private FacturaService facturaService;

    @RequestMapping("/facturas")
    public List<FacturaDTO> getAll() {
        return facturaService.getAll();
    }

    @RequestMapping("/crearFactura")
    public FacturaDTO save(@Valid @RequestBody CreatefacturasDTO data) {
        return facturaService.save(data);
    }
}
