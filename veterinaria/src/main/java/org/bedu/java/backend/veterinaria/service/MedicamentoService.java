package org.bedu.java.backend.veterinaria.service;

import org.bedu.java.backend.veterinaria.dto.CreateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.MedicamentoDTO;
import org.bedu.java.backend.veterinaria.model.Medicamento;
import org.bedu.java.backend.veterinaria.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoService {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    public List<MedicamentoDTO> getAll() {
        List<Medicamento> medicamentos = medicamentoRepository.getAll();
        return medicamentos.stream().map(x -> toDTO(x)).toList();
    }

    public MedicamentoDTO save(CreateMedicamentoDTO data) {
        Medicamento model = toModel(data);
        return toDTO(medicamentoRepository.save(model));
    }

    private Medicamento toModel(CreateMedicamentoDTO dto) {
        return new Medicamento(0, dto.getNombre(), dto.getClasificacion(), dto.getDescripcion(), dto.getFechaCaducidad(), dto.getExistencia(), dto.getPrecio(), dto.getInstruccionesUso());
    }
    private Medicamento toModel(MedicamentoDTO dto) {
        return new Medicamento(dto.getId(), dto.getNombre(), dto.getClasificacion(), dto.getDescripcion(), dto.getFechaCaducidad(), dto.getExistencia(), dto.getPrecio(), dto.getInstruccionesUso());
    }

    private MedicamentoDTO toDTO(Medicamento model) {
        return new MedicamentoDTO(model.getId(), model.getNombre(), model.getClasificacion(), model.getDescripcion(), model.getFechaCaducidad(), model.getExistencia(), model.getPrecio(), model.getInstruccionesUso());
    }

}
