package org.bedu.java.backend.veterinaria.service;


import org.bedu.java.backend.veterinaria.dto.CitaDTO;
import org.bedu.java.backend.veterinaria.dto.CreateCitaDTO;
import org.bedu.java.backend.veterinaria.model.Cita;
import org.bedu.java.backend.veterinaria.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public List<CitaDTO> getAll(){
        List<Cita> citas = citaRepository.getAll();
        List<CitaDTO> data = new LinkedList<>();

        for (Cita cita : citas){
            data.add(toDTO(cita));
        }
        return data;
    }

    public CitaDTO save (CreateCitaDTO data){
        Cita model = toModel(data);
        return toDTO (citaRepository.save(model));
    }

    private Cita toModel (CreateCitaDTO dto){
        return new Cita(0,dto.getVetName(), dto.getPetName(), dto.getDueAppointment(), dto.getDayAppointment(), dto.getHourAppointmet());
    }

    private Cita toModel (CitaDTO dto){
        return new Cita(dto.getId(), dto.getVetName(), dto.getPetName(), dto.getDueAppointment(), dto.getDayAppointment(), dto.getHourAppointmet());
    }

    private CitaDTO toDTO (Cita model){
        return new CitaDTO (model.getId(), model.getVetName(), model.getPetName(), model.getDueAppointment(), model.getDayAppointment(), model.getHourAppointmet());
    }


}




