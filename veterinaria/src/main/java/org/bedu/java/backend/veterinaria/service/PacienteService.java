package org.bedu.java.backend.veterinaria.service;
import java.util.LinkedList;
import java.util.List;

import org.bedu.java.backend.veterinaria.dto.CreatePacienteDTO;
import org.bedu.java.backend.veterinaria.dto.PacienteDTO;
import org.bedu.java.backend.veterinaria.model.Paciente;
import org.bedu.java.backend.veterinaria.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {
    
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<PacienteDTO> getAll() {
        List<Paciente> pacientes = pacienteRepository.getAll();

        List<PacienteDTO> data = new LinkedList<>();
        
        for (Paciente paciente : pacientes) {
            data.add(toDTO(paciente));
        }

        return data;
    }

    public PacienteDTO save(CreatePacienteDTO data) {
        Paciente model = toModel(data);
        return toDTO(pacienteRepository.save(model));
    }

    private Paciente toModel(CreatePacienteDTO dto) {
        return new Paciente(0, dto.getNombre(), dto.getEspecie(), dto.getRaza(), dto.getEdad());
    }

    private Paciente toModel(PacienteDTO dto) {
        return new Paciente(dto.getId(), dto.getNombre(), dto.getEspecie(), dto.getRaza(), dto.getEdad());
    }

    private PacienteDTO toDTO(Paciente model) {
        return new PacienteDTO(model.getId(), model.getNombre(), model.getEspecie(), model.getRaza(), model.getEdad());
    }
}