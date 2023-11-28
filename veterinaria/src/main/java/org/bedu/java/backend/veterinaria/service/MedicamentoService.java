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
    private MedicamentoRepository medicamentoRepository;

    @Autowired
    private MedicamentoMapper medicamentoMapper;

    public List<MedicamentoDTO> getAll() {
        List<Medicamento> medicamentos = medicamentoRepository.getAll();
        return medicamentos.stream().map(x -> medicamentoMapper.toDTO(x)).toList();
    }

    public MedicamentoDTO save(CreateMedicamentoDTO data) {
        Medicamento model = medicamentoMapper.toModel(data);
        return medicamentoMapper.toDTO(medicamentoRepository.save(model));
    }

}
