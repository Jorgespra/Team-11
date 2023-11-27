package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.Medicamento;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Repository
public class MedicamentoRepository {
    private long currentId;
    private List<Medicamento> medicamentos;

    public MedicamentoRepository() {
        currentId = 0;
        medicamentos = new LinkedList<>();
    }

    public List<Medicamento> getAll() {
        return medicamentos;
    }

    public Optional<Medicamento> getById(long id) {
        return medicamentos.stream().filter(x -> x.getId() == id).findFirst();
    }

    public Medicamento save(Medicamento data) {
        data.setId(++currentId);
        medicamentos.add(data);
        return data;
    }

    public void Update(long id, Medicamento data) {
        Optional<Medicamento> entry = getById(id);

        if(!entry.isPresent()) {
            return;
        }

        Medicamento medicamento = entry.get();

        if(data.getNombre() != null) {
            medicamento.setNombre(data.getNombre());
        }

        if (medicamento.getClasificacion() != null) {
            medicamento.setClasificacion(data.getClasificacion());
        }

        if (medicamento.getDescripcion() != null) {
            medicamento.setDescripcion(data.getDescripcion());
        }

        if (medicamento.getFechaCaducidad() != null) {
            medicamento.setFechaCaducidad(data.getFechaCaducidad());
        }

        if (medicamento.getExistencia() > 0) {
            medicamento.setExistencia(data.getExistencia());
        }

        if (medicamento.getPrecio() > 0) {
            medicamento.setPrecio(data.getPrecio());
        }

        if (medicamento.getInstruccionesUso() != null) {
            medicamento.setInstruccionesUso(data.getInstruccionesUso());
        }
    }
}
