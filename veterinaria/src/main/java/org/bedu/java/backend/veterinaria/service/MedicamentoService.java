package org.bedu.java.backend.veterinaria.service;

import org.bedu.java.backend.veterinaria.dto.CreateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.MedicamentoDTO;
import org.bedu.java.backend.veterinaria.mapper.MedicamentoMapper;
import org.bedu.java.backend.veterinaria.model.Medicamento;
import org.bedu.java.backend.veterinaria.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoService {

    @Autowired
    private MedicamentoRepository repository;

    @Autowired
    private MedicamentoMapper mapper;

    public List<MedicamentoDTO> findAll() {

        return repository
                .findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public MedicamentoDTO save(CreateMedicamentoDTO data) {
        Medicamento entity = repository
                .save(mapper.toModel(data));
        return  mapper.toDTO(entity);
    }

}
