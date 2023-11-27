package org.bedu.citas.repository;

import org.bedu.citas.model.Cita;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Repository
public class CitaRepository {

    private long currentId;
    private List<Cita> cita;

    public CitaRepository(){
        currentId = 1;
        cita = new LinkedList<>();
    }

    public List<Cita> getAll(){
        return  cita;
    }


    public Cita save (Cita data){
        data.setId(++currentId);
        cita.add(data);
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
    }
    public Optional<Cita> getById(long id) {
        // Version junior
        for (Cita cita : cita) {
            if (cita.getId() == id) {
                return Optional.of(cita);
            }
        }

        return Optional.empty();
    }


}
