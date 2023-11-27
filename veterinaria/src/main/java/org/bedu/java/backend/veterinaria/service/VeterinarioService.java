package org.bedu.java.backend.veterinaria.service;

import java.util.LinkedList;
import java.util.List;

import org.bedu.java.backend.veterinaria.model.VeterinarioModel;
import org.bedu.java.backend.veterinaria.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinarioService {
    
    @Autowired
    private VeterinarioRepository veterinarioRepository;

    public List<VeterinarioModel> getAllVeterinarios(){
        List<VeterinarioModel> veterinarios = veterinarioRepository.getAllVeterinarios();
        return veterinarios;
    }

    public VeterinarioModel save(VeterinarioModel model){
        return veterinarioRepository.save(model);
    }

}
