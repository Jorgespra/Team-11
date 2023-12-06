package org.bedu.java.backend.veterinaria.service;

import org.bedu.java.backend.veterinaria.mapper.FacturaMedicamentoMapper;
import org.bedu.java.backend.veterinaria.repository.FacturaMedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaMedicamentoService {
    @Autowired
    
    private FacturaMedicamentoRepository repository;

    @Autowired
    private FacturaMedicamentoMapper mapper;

    public void addMedicamento(long facturaId, long medicamentoId) {
        repository.save(mapper.toModel(facturaId, medicamentoId));
    }
}
