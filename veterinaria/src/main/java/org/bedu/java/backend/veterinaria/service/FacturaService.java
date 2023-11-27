package org.bedu.java.backend.veterinaria.service;

import java.util.List;

import org.bedu.java.backend.veterinaria.dto.CreatefacturasDTO;
import org.bedu.java.backend.veterinaria.dto.FacturaDTO;
import org.bedu.java.backend.veterinaria.model.Factura;
import org.bedu.java.backend.veterinaria.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public List<FacturaDTO> getAll() {
        List<Factura> facturas = facturaRepository.getAll();
        return facturas.stream().map(x -> toDTO(x)).toList();
    }

    public FacturaDTO save(CreatefacturasDTO data) {
        Factura model = toModel(data);
        return toDTO(facturaRepository.save(model));
    }

    private Factura toModel(CreatefacturasDTO data) {
        return new Factura(0, data.getDetalles(),
                data.getServicios(),
                data.getMedicamentos(),
                data.getCosto());
    }

    private FacturaDTO toDTO(Factura data) {
        return new FacturaDTO(data.getId(),
                data.getDetalles(),
                data.getServicios(),
                data.getMedicamentos(),
                data.getCosto());
    }
}
