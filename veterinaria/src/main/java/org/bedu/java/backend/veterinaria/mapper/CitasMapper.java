package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.CitaDTO;
import org.bedu.java.backend.veterinaria.dto.CreateCitaDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateCitaDTO;
import org.bedu.java.backend.veterinaria.model.Cita;
import org.bedu.java.backend.veterinaria.model.Interpretation;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel ="spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CitasMapper {

    CitaDTO toDTO(Cita model);

    List<CitaDTO> toDTO(List<Cita> model);

    @Mapping(target = "id", ignore = true)
    Cita toModel(CreateCitaDTO dto);

    @Mapping(target = "id", ignore = true)
    void update(@MappingTarget Cita cita, UpdateCitaDTO data);

}
