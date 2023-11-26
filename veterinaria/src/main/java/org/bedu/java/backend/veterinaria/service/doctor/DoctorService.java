package org.bedu.java.backend.veterinaria.service.doctor;

import java.util.LinkedList;
import java.util.List;

import org.bedu.java.backend.veterinaria.model.doctor.DoctorModel;
import org.bedu.java.backend.veterinaria.repository.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    
    @Autowired
    private DoctorRepository doctorRepository;

    public List<DoctorModel> getAllDoctores(){
        List<DoctorModel> doctores = doctorRepository.getAllDoctores();
        return doctores;
    }

    public DoctorModel save(DoctorModel model){
        return doctorRepository.save(model);
    }

}
