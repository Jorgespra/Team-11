package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.HistorialMedicoDto;
import org.bedu.java.backend.veterinaria.model.HistorialMedico;

import io.swagger.v3.oas.annotations.media.Schema;

public class HistorialMedicoMapper {

     /**
     * Convierte un objeto de tipo HistorialMedico en un objeto de tipo HistorialMedicoDto.
     *
     * @param historialMedico Objeto de tipo HistorialMedico a ser mapeado.
     * @return Un objeto de tipo HistorialMedicoDto resultante del mapeo.
     */
    @Schema(description = "Convierte un objeto HistorialMedico en un objeto HistorialMedicoDto")
    public static HistorialMedicoDto mapToHistorialMedicoDto(HistorialMedico historialMedico){
        HistorialMedicoDto historialMedicoDto = new HistorialMedicoDto(
            historialMedico.getId(),
            historialMedico.getVeterinario(),
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
      /**
     * Convierte un objeto de tipo HistorialMedicoDto en un objeto de tipo HistorialMedico.
     *
     * @param historialMedicoDto Objeto de tipo HistorialMedicoDto a ser mapeado.
     * @return Un objeto de tipo HistorialMedico resultante del mapeo.
     */
    @Schema(description = "Convierte un objeto HistorialMedicoDto en un objeto HistorialMedico")
    public static HistorialMedico mapToHistorialMedico(HistorialMedicoDto historialMedicoDto){
        HistorialMedico historialMedico = new HistorialMedico(
            historialMedicoDto.getId(),
            historialMedicoDto.getVeterinario(),
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