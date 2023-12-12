package org.bedu.java.backend.veterinaria.mapper;

import java.util.List;

import org.bedu.java.backend.veterinaria.dto.CreateVeterinarioDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateVeterinarioDTO;
import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import org.bedu.java.backend.veterinaria.dto.VeterinarioDTO;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface VeterinarioMapper {

    VeterinarioDTO toDTO(Veterinario model);
    List<VeterinarioDTO> toDTO(List<Veterinario> model);

    @Mapping(target="id", ignore = true)
    Veterinario toModel(CreateVeterinarioDTO dto);

    @Mapping(target = "id", ignore = true)
    void update(@MappingTarget Veterinario veterinario, UpdateVeterinarioDTO data);
}
