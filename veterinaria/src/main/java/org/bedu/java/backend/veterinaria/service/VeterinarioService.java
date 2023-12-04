package org.bedu.java.backend.veterinaria.service;

import org.bedu.java.backend.veterinaria.dto.CreateVeterinarioDTO;
import org.bedu.java.backend.veterinaria.dto.VeterinarioDTO;
import org.bedu.java.backend.veterinaria.mapper.VeterinarioMapper;
import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.bedu.java.backend.veterinaria.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarioService {

    @Autowired
    private VeterinarioRepository repository;

    @Autowired
    private VeterinarioMapper mapper;

    public List<VeterinarioDTO> findAll() {

        return repository
                .findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    public VeterinarioDTO save(CreateVeterinarioDTO data) {
        Veterinario entity = repository
                .save(mapper.toModel(data));
        return  mapper.toDTO(entity);
    }

}
