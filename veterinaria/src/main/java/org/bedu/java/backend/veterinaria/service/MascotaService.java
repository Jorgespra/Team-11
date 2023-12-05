package org.bedu.java.backend.veterinaria.service;
// import java.util.LinkedList;
import java.util.List;

import org.bedu.java.backend.veterinaria.dto.CreateMascotaDTO;
import org.bedu.java.backend.veterinaria.dto.MascotaDTO;
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
    // private MascotaRepository mascotaRepository;

    public List<MascotaDTO> findAll() {
        return repository
            .findAll()
            .stream()
            .map(mapper::toDTO)
            .toList();

    }

    public MascotaDTO save(CreateMascotaDTO data) {
        Mascota entity = repository
            .save(mapper.toModel(data));
        
        return mapper.toDTO(entity);
    }

/*     public List<MascotaDTO> getAll() {
        List<Mascota> mascotas = mascotaRepository.getAll();

        List<MascotaDTO> data = new LinkedList<>();
        
        for (Mascota mascota : mascotas) {
            data.add(toDTO(mascota));
        }

        return data;
    }
 */
/*     public MascotaDTO save(CreateMascotaDTO data) {
        Mascota model = toModel(data);
        return toDTO(mascotaRepository.save(model));
    }
 */
/*     private Mascota toModel(CreateMascotaDTO dto) {
        return new Mascota(0, dto.getNombre(), dto.getEspecie(), dto.getRaza(), dto.getEdad());
    }

    private Mascota toModel(MascotaDTO dto) {
        return new Mascota(dto.getId(), dto.getNombre(), dto.getEspecie(), dto.getRaza(), dto.getEdad());
    }

    private MascotaDTO toDTO(Mascota model) {
        return new MascotaDTO(model.getId(), model.getNombre(), model.getEspecie(), model.getRaza(), model.getEdad());
    }
 */
}