package org.bedu.java.backend.veterinaria.service;

import java.util.List;
import org.bedu.java.backend.veterinaria.dto.CitaDTO;
import org.bedu.java.backend.veterinaria.dto.CreateCitaDTO;
import org.bedu.java.backend.veterinaria.mapper.CitasMapper;
import org.bedu.java.backend.veterinaria.model.Cita;
import org.bedu.java.backend.veterinaria.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;


@Service
public class CitaService {

    @Autowired
    private CitaRepository repository;

    @Autowired
    private CitasMapper mapper;

    public List<CitaDTO> findAll(){
        return repository
                .findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public CitaDTO save(CreateCitaDTO data){
        Cita entity = repository
                .save(mapper.toModel(data));

        return mapper.toDTO(entity);
    }
}




