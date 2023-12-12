package org.bedu.java.backend.veterinaria.service;

import org.bedu.java.backend.veterinaria.dto.HistorialMedicoDto;
import org.bedu.java.backend.veterinaria.exception.HistorialMedicoNotFoundException;

import java.util.List;

public interface HistorialMedicoService {
    HistorialMedicoDto createHistorialMedico(HistorialMedicoDto historialMedico) throws HistorialMedicoNotFoundException;

    HistorialMedicoDto updateHistorialMedico(HistorialMedicoDto historialMedico) throws HistorialMedicoNotFoundException;

    void deleteHistorialMedico(Long historialMedicoId);

    List<HistorialMedicoDto> getAllHistorialMedico();
    
    HistorialMedicoDto getHistorialMedicoById(Long historialMedicoId) throws HistorialMedicoNotFoundException;

    List<HistorialMedicoDto> getHistorialesByMascotaId(Long mascotaId);

    List<HistorialMedicoDto> getHistorialesByVeterinarioId(Long veterinarioId);

}
