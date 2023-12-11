package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.HistorialMedicoDto;
import org.bedu.java.backend.veterinaria.model.HistorialMedico;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import io.swagger.v3.oas.annotations.media.Schema;

@Mapper
public interface AutoHistorialMedicoMapper {
    // Obtener una instancia del mapper
    AutoHistorialMedicoMapper MAPPER = Mappers.getMapper(AutoHistorialMedicoMapper.class);
   
    // Mapeo de HistorialMedico a HistorialMedicoDto
    @Schema(description = "Convierte un objeto HistorialMedico en un objeto HistorialMedicoDto")
    HistorialMedicoDto mapToHistorialMedicoDto(HistorialMedico historialMedico);

    // Mapeo de HistorialMedicoDto a HistorialMedico
    @Schema(description = "Convierte un objeto HistorialMedicoDto en un objeto HistorialMedico")
    HistorialMedico mapToHistorialMedico(HistorialMedicoDto historialMedicoDto);

}