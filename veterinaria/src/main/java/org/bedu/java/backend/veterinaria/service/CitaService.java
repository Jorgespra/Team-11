package org.bedu.java.backend.veterinaria.service;

import org.bedu.citas.dto.CitaDTO;
import org.bedu.citas.dto.CreateCitaDTO;
import org.bedu.citas.model.Cita;
import org.bedu.citas.repository.CitaRepository;
import org.bedu.java.backend.veterinaria.dto.CitaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public List<CitaDTO> getAll(){
        List<Cita> cita = citaRepository.getAll();
        List<CitaDTO> data = new LinkedList<>();

        for (Cita citas : cita){
            data.add(toDTO(citas));
        }
        return data;
    }

    public CitaDTO save (CreateCitaDTO data){
        Cita model = toModel(data);
        return toDTO (citaRepository.save(model));
    }

    private Cita toModel (CreateCitaDTO dto){
        return new Cita(0,dto.getPetName(), dto.getVetName(), dto.getDueAppointment(), dto.getDayAppointment(), dto.getHourAppointmet());
    }

    private Cita toModel (CitaDTO dto){
        return new Cita(dto.getId(), dto.getVetName(), dto.getPetName(), dto.getDueAppointment(), dto.getDayAppointment(), dto.getHourAppointmet());
    }

    private CitaDTO toDTO (Cita model){
        return new CitaDTO (model.getId(), model.getVetName(), model.getPetName(), model.getDueAppointment(), model.getDayAppointment(), model.getHourAppointmet());
    }


}




