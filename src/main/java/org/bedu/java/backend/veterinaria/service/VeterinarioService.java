package org.bedu.java.backend.veterinaria.service;

import org.bedu.java.backend.veterinaria.dto.CreateVeterinariioDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateVeterinarioDTO;
import org.bedu.java.backend.veterinaria.dto.VeterinarioDTO;
import org.bedu.java.backend.veterinaria.exception.CitaNotFoundException;
import org.bedu.java.backend.veterinaria.exception.VeterinarioNotFoundException;
import org.bedu.java.backend.veterinaria.mapper.VeterinarioMapper;
import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.bedu.java.backend.veterinaria.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinarioService {

    @Autowired
    private VeterinarioRepository repositoryvet;

    @Autowired
    private VeterinarioMapper mappervet;

    public List<VeterinarioDTO> findAll() {
        return mappervet.toDTO(repositoryvet.findAll());
    }

    public VeterinarioDTO save(CreateVeterinariioDTO data) {
        Veterinario entity = repositoryvet.save(mappervet.toModel(data));
        return mappervet.toDTO(entity);
    }

    public void update(long veterinarioId, UpdateVeterinarioDTO data) throws VeterinarioNotFoundException {
        Optional<Veterinario> result = repositoryvet.findById(veterinarioId);

        if (!result.isPresent()) {
            throw new VeterinarioNotFoundException(veterinarioId);
        }

        Veterinario veterinario = result.get();

        // Aplicar los cambios al artista
        mappervet.update(veterinario, data);

        repositoryvet.save(veterinario);
    }

}
