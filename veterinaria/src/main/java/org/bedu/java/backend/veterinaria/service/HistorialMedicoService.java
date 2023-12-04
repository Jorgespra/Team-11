package org.bedu.java.backend.veterinaria.service;

import org.bedu.java.backend.veterinaria.dto.HistorialMedicoDto;

import java.util.List;

public interface HistorialMedicoService {
    HistorialMedicoDto createHistorialMedico(HistorialMedicoDto historialMedico);

    HistorialMedicoDto getHistorialMedicoById(Long historialMedicoId);

    List<HistorialMedicoDto> getAllHistorialMedico();

    HistorialMedicoDto updateHistorialMedico(HistorialMedicoDto historialMedico);

    void deleteHistorialMedico(Long historialMedicoId);

}
