package org.bedu.java.backend.veterinaria.mapper;

import java.util.List;

import org.bedu.java.backend.veterinaria.dto.CreateMascotaDTO;
import org.bedu.java.backend.veterinaria.dto.MascotaDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateMascotaDTO;
import org.bedu.java.backend.veterinaria.model.Mascota;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MascotaMapper {

    MascotaMapper INSTANCE = Mappers.getMapper(MascotaMapper.class);
    UpdateMascotaDTO toUpdateDTO(MascotaDTO dto);

    @Mapping(target = "id", ignore = true)
    Mascota toModel(MascotaDTO dto);

    // source: Mascota
    // target: MascotaDTO
    // No hay anotaciones porque la conversión es uno a uno, es decir
    // Mascota.id -> MascotaDTO.id
    // Mascota.name -> MascotaDTO.name
    MascotaDTO toDTO(Mascota model);
    List<MascotaDTO> toDTO(List<Mascota> model);

    // source: CreateMascotaDTO -> Objeto de entrada
    // target: Mascota -> Objeto de salida
    // En el target se va a ignorar el campo "id"
    // "stock" en el source pasa a ser "quantity" en el target
    // @Mapping(source = "stock", target = "quantity")
    @Mapping(target = "id", ignore = true)
    Mascota toModel(CreateMascotaDTO dto);

    @Mapping(target = "id", ignore = true)
    void update(@MappingTarget Mascota mascota, UpdateMascotaDTO data);

}