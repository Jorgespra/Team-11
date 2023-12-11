package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.CreateMascotaDTO;
import org.bedu.java.backend.veterinaria.dto.MascotaDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateMascotaDTO;
import org.bedu.java.backend.veterinaria.model.Mascota;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", injectionStrategy = injectionStrategy.CONSTRUCTOR)
public interface VeterinarioMapper {

    VeterinarioDTO toDTO(Veterinario model);
    List<VeterinarioDTO> toDTO(List<Veterinario> model);

    @Mapping(target="id", ignore = true)
    Veterinario toModel(CreateVeterinarioDTO dto);

    @Mapping(target = "id", ignore = true)
    void update(@MappingTarget Veterinario veterinario, UpdateVeterinarioDTO data);



}
