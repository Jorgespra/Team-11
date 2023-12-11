package org.bedu.java.backend.veterinaria.service;

import org.bedu.java.backend.veterinaria.dto.CreateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.MedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.exception.MedicamentoNotFoundException;
import org.bedu.java.backend.veterinaria.mapper.MedicamentoMapper;
import org.bedu.java.backend.veterinaria.model.Medicamento;
import org.bedu.java.backend.veterinaria.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentoService {

    @Autowired
    private MedicamentoRepository repository;

    @Autowired
    private MedicamentoMapper mapper;

    public List<MedicamentoDTO> findAll() {
        return mapper.toDTO(repository.findAll());
    }

    public MedicamentoDTO save(CreateMedicamentoDTO data) {
        Medicamento entity = repository
                .save(mapper.toModel(data));
        return  mapper.toDTO(entity);
    }

    public void update(long medicamentoId, UpdateMedicamentoDTO data) throws MedicamentoNotFoundException {
        Optional<Medicamento> result = repository.findById(medicamentoId);

        if(!result.isPresent()) {
            throw new MedicamentoNotFoundException(medicamentoId);
        }

        Medicamento medicamento = result.get();
        mapper.update(medicamento, data);
        repository.save(medicamento);
    }

    public void deleteById(Long medicamentoId) throws MedicamentoNotFoundException {

        Optional<Medicamento> result = repository.findById(medicamentoId);

        if(!result.isPresent()) {
            throw new MedicamentoNotFoundException(medicamentoId);
        }

        repository.deleteById(medicamentoId);
    }

}