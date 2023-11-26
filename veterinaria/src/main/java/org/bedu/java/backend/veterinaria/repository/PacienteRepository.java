package org.bedu.java.backend.veterinaria.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.veterinaria.model.Paciente;
import org.springframework.stereotype.Repository;

@Repository
public class PacienteRepository {
    
    private int currentId;
    private List<Paciente> pacientes;

    public PacienteRepository() {
        currentId = 0;
        pacientes = new LinkedList<>();
    }

    public List<Paciente> getAll() {
        return pacientes;
    }

    public Optional<Paciente> getById(long id) {
        for (Paciente paciente : pacientes) {
            if (paciente.getId() == id) {
                return Optional.of(paciente);
            }
        }

        return Optional.empty();
    }

    public Paciente save(Paciente data) {
        data.setId(++currentId);
        pacientes.add(data);
        return data;
    }

    public void update(long id, Paciente data) {
        Optional<Paciente> entry = getById(id);

        if (!entry.isPresent()) {
            return;
        }

        Paciente paciente = entry.get();

        if (data.getNombre() != null) {
            paciente.setNombre(data.getNombre());
        }

        if (data.getEspecie() != null) {
            paciente.setEspecie(data.getEspecie());
        }

        if (data.getRaza() != null) {
            paciente.setRaza(data.getRaza());
        }

        if (data.getEdad() > 0) {
            paciente.setEdad(data.getEdad());
        }

    }
}