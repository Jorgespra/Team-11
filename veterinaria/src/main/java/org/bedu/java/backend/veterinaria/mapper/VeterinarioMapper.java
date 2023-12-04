package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.CreateVeterinarioDTO;
import org.bedu.java.backend.veterinaria.dto.VeterinarioDTO;
import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface VeterinarioMapper {
    VeterinarioDTO toDTO(Veterinario model);

    @Mapping(target = "id", ignore = true)
    Veterinario toModel(CreateVeterinarioDTO dto);
}
