package org.bedu.java.backend.veterinaria.service;

import java.util.List;
import org.bedu.java.backend.veterinaria.dto.CitaDTO;
import org.bedu.java.backend.veterinaria.dto.CreateCitaDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateCitaDTO;
import org.bedu.java.backend.veterinaria.exception.CitaNotFoundException;
import org.bedu.java.backend.veterinaria.mapper.CitasMapper;
import org.bedu.java.backend.veterinaria.model.Cita;
import org.bedu.java.backend.veterinaria.model.Interpretation;
import org.bedu.java.backend.veterinaria.repository.CitaRepository;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Optional;


@Service
public class CitaService {

    @Autowired
    private CitaRepository repository;

    @Autowired
    private CitasMapper mapper;

    public List<CitaDTO> findAll() {
        return mapper.toDTO(repository.findAll());
    }

    public CitaDTO save(CreateCitaDTO data) {
        Cita entity = repository.save(mapper.toModel(data));
        return mapper.toDTO(entity);
    }




}




