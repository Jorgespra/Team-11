package org.bedu.java.backend.veterinaria.service;
import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.veterinaria.dto.CreateMascotaDTO;
import org.bedu.java.backend.veterinaria.dto.MascotaDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateMascotaDTO;
import org.bedu.java.backend.veterinaria.exception.MascotaNotFoundException;
import org.bedu.java.backend.veterinaria.mapper.MascotaMapper;
import org.bedu.java.backend.veterinaria.model.Mascota;
import org.bedu.java.backend.veterinaria.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService {
    
    @Autowired
    private MascotaRepository repository;

    @Autowired
    private MascotaMapper mapper;

    public List<MascotaDTO> findAll() {
        return mapper.toDTO(repository.findAll());
    }

/*     public List<MascotaDTO> findAll() {
        return repository
            .findAll()
            .stream()
            .map(mapper::toDTO)
            .toList();

    }
 */

    public MascotaDTO save(CreateMascotaDTO data) {
        Mascota entity = repository
            .save(mapper.toModel(data));
        
        return mapper.toDTO(entity);
    }

/*     public Optional<MascotaDTO> findById(Long id) {
        return repository
            .findById(id)
            .map(mapper::toDTO);
    }
 */

    public void update(long mascotaId, UpdateMascotaDTO data) throws MascotaNotFoundException {
        Optional<Mascota> result = repository.findById(mascotaId);

        if (!result.isPresent()) {
            throw new MascotaNotFoundException(mascotaId);
        }

        Mascota mascota = result.get();

        // Aplicar los cambios a la mascota
        mapper.update(mascota, data);

        repository.save(mascota);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}