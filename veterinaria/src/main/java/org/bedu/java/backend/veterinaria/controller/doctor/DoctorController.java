package org.bedu.java.backend.veterinaria.controller.doctor;

import java.util.List;

import org.bedu.java.backend.veterinaria.model.doctor.DoctorModel;
import org.bedu.java.backend.veterinaria.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
    
    @Autowired
    private DoctorService doctorService;

    @RequestMapping("/getDoctores")
    public List<DoctorModel> getAllDoctores(){
        return doctorService.getAllDoctores();
    }

    @RequestMapping("/createDoctor")
    public DoctorModel save(@RequestBody DoctorModel model){
        return doctorService.save(model);
    }






}
