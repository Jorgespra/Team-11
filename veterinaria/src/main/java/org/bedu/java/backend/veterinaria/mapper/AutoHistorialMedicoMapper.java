package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.HistorialMedicoDto;
import org.bedu.java.backend.veterinaria.model.HistorialMedico;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoHistorialMedicoMapper {
    // Obtener una instancia del mapper
    AutoHistorialMedicoMapper MAPPER = Mappers.getMapper(AutoHistorialMedicoMapper.class);
   
    // Mapeo de HistorialMedico a HistorialMedicoDto
    HistorialMedicoDto mapToHistorialMedicoDto(HistorialMedico historialMedico);

    // Mapeo de HistorialMedicoDto a HistorialMedico
    HistorialMedico mapToHistorialMedico(HistorialMedicoDto historialMedicoDto);

}
