package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.CitaDTO;
import org.bedu.java.backend.veterinaria.dto.CreateCitaDTO;
import org.bedu.java.backend.veterinaria.model.Cita;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel ="spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CitasMapper {
    CitaDTO toDTO (Cita model);

    @Mapping(target = "id", ignore = true)
    Cita toModel (CreateCitaDTO dto);
}
