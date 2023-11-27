package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.Cita;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Repository
public class CitaRepository {

    private long currentId;
    private List<Cita> citas;

    public CitaRepository(){
        currentId = 0;
        citas = new LinkedList<>();
    }

    public List<Cita> getAll(){
        return  citas;
    }


    public Cita save (Cita data){
        data.setId(++currentId);
        citas.add(data);
        return data;
    }

    public void update(long id, Cita data) {
        Optional<Cita> entry = getById(id);

        if (!entry.isPresent()) {
            return;
        }

        Cita cita = entry.get();

        if (data.getVetName() != null) {
            cita.setVetName(data.getVetName());
        }

        if (data.getPetName() != null) {
            cita.setPetName(data.getPetName());
        }

        if (data.getDueAppointment() !=null) {
            cita.setDueAppointment(data.getDueAppointment());
        }
        if (data.getDayAppointment() !=null){
            cita.setDayAppointment(data.getDayAppointment());
        }
        if(data.getHourAppointmet() !=null){
            cita.setHourAppointmet(data.getHourAppointmet());
        }
    }
    public Optional<Cita> getById(long id) {
        // Version junior
        for (Cita cita : citas) {
            if (cita.getId() == id) {
                return Optional.of(cita);
            }
        }

        return Optional.empty();
    }


}
