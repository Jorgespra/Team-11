package org.bedu.java.backend.veterinaria.mapper;


import org.bedu.java.backend.veterinaria.model.Interpretation;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.context.annotation.Lazy;

@Mapper (componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface InterpretationMapper {


    @Mapping(source = "citaId", target = "id.citaId")
    @Mapping(source = "citaId", target = "cita.id")
    @Mapping(source = "veterinarioId", target = "id.veterinarioId")
    @Mapping(source = "veterinarioId", target = "veterinario.id")
    @Mapping(source = "mascotaId", target = "id.mascotaId")
    @Mapping(source = "mascotaId", target = "mascota.id")
    Interpretation toModel(Long citaId, Long veterinarioId, Long mascotaId);

}
