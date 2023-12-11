package main.java.org.bedu.java.backend.veterinaria.service;

import main.java.org.bedu.java.backend.veterinaria.repository.VeterinarioRepository;

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
        Veterianrio entity = veterinarioRepository.save(mapper.toModel(data));
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
