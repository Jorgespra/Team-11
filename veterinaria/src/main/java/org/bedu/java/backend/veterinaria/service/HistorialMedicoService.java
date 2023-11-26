package org.bedu.java.backend.veterinaria.service;

import org.bedu.java.backend.veterinaria.model.HistorialMedico;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HistorialMedicoService {

    private List<HistorialMedico> historiales = new ArrayList<>();

    // Obtener todos los historiales médicos
    public List<HistorialMedico> obtenerTodosHistoriales() {
        return historiales;
    }

    // Obtener un historial médico por ID
    public HistorialMedico obtenerHistorialPorId(long id) {
        Optional<HistorialMedico> historialEncontrado = historiales.stream()
                .filter(h -> h.getId() == id)
                .findFirst();
        return historialEncontrado.orElse(null);
    }

    // Crear un nuevo historial médico
    public HistorialMedico crearHistorial(HistorialMedico historial) {
        historial.setId(generarNuevoId());
        historiales.add(historial);
        return historial;
    }

    // Actualizar un historial médico existente
    public HistorialMedico actualizarHistorial(long id, HistorialMedico historialActualizado) {
        for (int i = 0; i < historiales.size(); i++) {
            if (historiales.get(i).getId() == id) {
                historiales.set(i, historialActualizado);
                return historialActualizado;
            }
        }
        return null;
    }

    // Eliminar un historial médico por ID
    public boolean eliminarHistorial(long id) {
        return historiales.removeIf(h -> h.getId() == id);
    }

    // Método auxiliar para generar un nuevo ID (puedes ajustarlo según tus necesidades)
    private long generarNuevoId() {
        return System.currentTimeMillis(); // En este ejemplo, usamos la marca de tiempo actual como ID
    }
}
