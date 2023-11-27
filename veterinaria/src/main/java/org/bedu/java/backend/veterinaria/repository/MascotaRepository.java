package org.bedu.java.backend.veterinaria.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.veterinaria.model.Mascota;
import org.springframework.stereotype.Repository;

@Repository
public class MascotaRepository {
    
    private int currentId;
    private List<Mascota> mascotas;

    public MascotaRepository() {
        currentId = 0;
        mascotas = new LinkedList<>();
    }

    public List<Mascota> getAll() {
        return mascotas;
    }

    public Optional<Mascota> getById(long id) {
        for (Mascota mascota : mascotas) {
            if (mascota.getId() == id) {
                return Optional.of(mascota);
            }
        }

        return Optional.empty();
    }

    public Mascota save(Mascota data) {
        data.setId(++currentId);
        mascotas.add(data);
        return data;
    }

    public void update(long id, Mascota data) {
        Optional<Mascota> entry = getById(id);

        if (!entry.isPresent()) {
            return;
        }

        Mascota mascota = entry.get();

        if (data.getNombre() != null) {
            mascota.setNombre(data.getNombre());
        }

        if (data.getEspecie() != null) {
            mascota.setEspecie(data.getEspecie());
        }

        if (data.getRaza() != null) {
            mascota.setRaza(data.getRaza());
        }

        if (data.getEdad() > 0) {
            mascota.setEdad(data.getEdad());
        }

    }
}