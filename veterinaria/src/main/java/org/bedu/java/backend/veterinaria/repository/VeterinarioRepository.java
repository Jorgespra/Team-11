package org.bedu.java.backend.veterinaria.repository;

import java.util.LinkedList;
import java.util.List;

import org.bedu.java.backend.veterinaria.model.VeterinarioModel;
import org.springframework.stereotype.Repository;

@Repository
public class VeterinarioRepository {

    private long autoID;
    private List<VeterinarioModel> veterinarios;

    public VeterinarioRepository(){
        autoID = 0;
        veterinarios = new LinkedList<>();
    }

    public List<VeterinarioModel> getAllVeterinarios(){
        return veterinarios;
    }

    public VeterinarioModel save(VeterinarioModel model){
        model.setId(++autoID);
        veterinarios.add(model);
        return model;
    }


    
}
 
