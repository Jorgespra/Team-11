package org.bedu.java.backend.veterinaria.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.veterinaria.model.Factura;
import org.springframework.stereotype.Repository;

@Repository
public class FacturaRepository {
    private long currentId;
    private List<Factura> facturas;

    public FacturaRepository() {
        currentId = 0;
        facturas = new LinkedList<>();
    }

    public List<Factura> getAll() {
        return facturas;
    }

    public Optional<Factura> getById(long id) {

        return facturas.stream().filter(x -> x.getId() == currentId).findFirst();
    }

    public Factura save(Factura data) {
        data.setId(++currentId);
        facturas.add(data);
        return data;
    }

    public void update(long id, Factura data) {
        Optional<Factura> entry = getById(id);
        if (!entry.isPresent()) {
            return;
        }

        Factura factura = entry.get();
        if (data.getDetalles() != null) {
            factura.setDetalles(data.getDetalles());
        }
        if (data.getCosto() > 0) {
            factura.setCosto(data.getCosto());
        }
        if (data.getMedicamentos() != null) {
            factura.setMedicamentos(data.getMedicamentos());
        }
        if (data.getServicios() != null) {
            factura.setServicios(data.getServicios());
        }

    }
}
