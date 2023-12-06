package org.bedu.java.backend.veterinaria.service;
// import java.util.LinkedList;
import java.util.List;

import org.bedu.java.backend.veterinaria.dto.CreateFacturaDTO;
import org.bedu.java.backend.veterinaria.dto.FacturaDTO;
import org.bedu.java.backend.veterinaria.mapper.FacturaMapper;
import org.bedu.java.backend.veterinaria.model.Factura;
import org.bedu.java.backend.veterinaria.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {
    
    @Autowired
    private FacturaRepository repository;

    @Autowired
    private FacturaMapper mapper;

    public List<FacturaDTO> findAll() {
        return repository
            .findAll()
            .stream()
            .map(mapper::toDTO)
            .toList();
    }

    public FacturaDTO save(CreateFacturaDTO data) {
        Factura entity = repository.save(mapper.toModel(data));    
        return mapper.toDTO(entity);
    }
}