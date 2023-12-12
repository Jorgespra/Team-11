package org.bedu.java.backend.veterinaria.service;

import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.veterinaria.dto.CreateVeterinarioDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateVeterinarioDTO;
import org.bedu.java.backend.veterinaria.dto.VeterinarioDTO;
import org.bedu.java.backend.veterinaria.exception.VeterinarioNotFoundException;
import org.bedu.java.backend.veterinaria.mapper.VeterinarioMapper;
import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.bedu.java.backend.veterinaria.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinarioService {
    
    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @Autowired
    private VeterinarioMapper mapper;

    public List<VeterinarioDTO> findAll(){
        return mapper.toDTO(veterinarioRepository.findAll());
    }

    public VeterinarioDTO save(CreateVeterinarioDTO data){
        Veterinario entity = veterinarioRepository.save(mapper.toModel(data));
        return mapper.toDTO(entity);
    }

    public void update(long veterinarioId, UpdateVeterinarioDTO data) throws VeterinarioNotFoundException {
        Optional<Veterinario> result = veterinarioRepository.findById(veterinarioId);

        if(!result.isPresent()){
            throw new VeterinarioNotFoundException(veterinarioId);
        }

        Veterinario veterinario = result.get();
        mapper.update(veterinario,data);
        veterinarioRepository.save(veterinario);
    }

    public void deleteById(Long id){
        veterinarioRepository.deleteById(id);
    }

}
