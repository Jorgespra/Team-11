package org.bedu.java.backend.veterinaria.service;

import org.bedu.java.backend.veterinaria.dto.CitaDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateCitaDTO;
import org.bedu.java.backend.veterinaria.exception.CitaNotFoundException;
import org.bedu.java.backend.veterinaria.mapper.CitasMapper;
import org.bedu.java.backend.veterinaria.mapper.InterpretationMapper;
import org.bedu.java.backend.veterinaria.model.Cita;
import org.bedu.java.backend.veterinaria.repository.InterpretationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InterpretationService {

    @Autowired
    private InterpretationRepository repository;

    @Autowired
    private InterpretationMapper mapper;

    @Autowired
    private CitasMapper citasMapper;

    public void createCita(long citaId, long veterinarioId, Long mascotaId) {
        repository.save(mapper.toModel(citaId, veterinarioId, mascotaId));
    }

    public List<CitaDTO> findCitasByVeterinario(long veterinarioId) {
        return citasMapper.toDTO(repository.findCitaByVeterinario(veterinarioId));
    }

    public List<CitaDTO> findCitasByMascota(long mascotaId) {
        return citasMapper.toDTO(repository.findCitaByMascota(mascotaId));
    }





}
