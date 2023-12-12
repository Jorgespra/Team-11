package org.bedu.java.backend.veterinaria.service;

// import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.veterinaria.dto.CreateFacturaDTO;
import org.bedu.java.backend.veterinaria.dto.FacturaDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateFacturaDTO;
import org.bedu.java.backend.veterinaria.exception.FacturaNotFound;
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
        Factura temp = mapper.toModel(data);
        temp.setTotal((data.getIva() * data.getSub_total()) + data.getSub_total());
        Factura entity = repository.save(temp);
        return mapper.toDTO(entity);
    }

    public void update( long facturaId ,UpdateFacturaDTO data) throws FacturaNotFound {
        Optional<Factura> temp = repository.findById(facturaId);
        double total = 0;
        if (!temp.isPresent()) {
            throw new FacturaNotFound(facturaId);
        }        
        Factura factura = temp.get();
        total = (data.getIva() * data.getSub_total()) + data.getSub_total();
        factura.setTotal(total);
        mapper.update(factura, data);       
        repository.save(factura);
    }

    public void deleteById(long facturaId){
        repository.deleteById(facturaId);
    }
}