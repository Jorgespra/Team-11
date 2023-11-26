package org.bedu.java.backend.veterinaria.repository.doctor;

import java.util.LinkedList;
import java.util.List;

import org.bedu.java.backend.veterinaria.model.doctor.DoctorModel;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorRepository {

    private long autoID;
    private List<DoctorModel> doctores;

    public DoctorRepository(){
        autoID = 0;
        doctores = new LinkedList<>();
    }

    public List<DoctorModel> getAllDoctores(){
        return doctores;
    }

    public DoctorModel save(DoctorModel model){
        model.setId(++autoID);
        doctores.add(model);
        return model;
    }


    
}
 
