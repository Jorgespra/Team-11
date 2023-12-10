package org.bedu.java.backend.veterinaria.service;

import org.bedu.java.backend.veterinaria.dto.MedicamentoDTO;
import org.bedu.java.backend.veterinaria.mapper.FacturaMedicamentoMapper;
import org.bedu.java.backend.veterinaria.mapper.MedicamentoMapper;
import org.bedu.java.backend.veterinaria.repository.FacturaMedicamentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaMedicamentoService {

    @Autowired
    private FacturaMedicamentoRepository repository;

    @Autowired
    private FacturaMedicamentoMapper mapper;

    @Autowired
    private MedicamentoMapper medicamentoMapper;

    
    public void addMedicamento(long facturaId, long medicamentoId, double precio, int cantidad) {
        repository.save(mapper.toModel(facturaId, medicamentoId, precio, cantidad));
    }

    public List<MedicamentoDTO> findMedicamentoByFactura(long facturaId) {
        return medicamentoMapper.toDTO(repository.findMedicamentoByFactura(facturaId));
    }
}
