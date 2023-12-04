package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.HistorialMedicoDto;
import org.bedu.java.backend.veterinaria.model.HistorialMedico;

public class HistorialMedicoMapper {

    // Convertir Historial Medico JPA Entity into HistorialMedocoDto
    public static HistorialMedicoDto mapToHistorialMedicoDto(HistorialMedico historialMedico){
        HistorialMedicoDto historialMedicoDto = new HistorialMedicoDto(
            historialMedico.getId(),
            historialMedico.getDoctor(),
            historialMedico.getMascota(),
            historialMedico.getFechaConsulta(),
            historialMedico.getDiagnostico(),
            historialMedico.getTratamientoActual(),
            historialMedico.getMedicamentosRecetados(),
            historialMedico.getResultadoPruebas(),
            historialMedico.getObservaciones()
        );
        return historialMedicoDto;
    }

    public static HistorialMedico mapToHistorialMedico(HistorialMedicoDto historialMedicoDto){
        HistorialMedico historialMedico = new HistorialMedico(
            historialMedicoDto.getId(),
            historialMedicoDto.getDoctor(),
            historialMedicoDto.getMascota(),
            historialMedicoDto.getFechaConsulta(),
            historialMedicoDto.getDiagnostico(),
            historialMedicoDto.getTratamientoActual(),
            historialMedicoDto.getMedicamentosRecetados(),
            historialMedicoDto.getResultadoPruebas(),
            historialMedicoDto.getObservaciones()
        );
        return historialMedico;
    }
    
}
