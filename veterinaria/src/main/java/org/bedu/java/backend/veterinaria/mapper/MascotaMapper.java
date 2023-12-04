package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.CreateMascotaDTO;
import org.bedu.java.backend.veterinaria.dto.MascotaDTO;
import org.bedu.java.backend.veterinaria.model.Mascota;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MascotaMapper {
    // source: Mascota
    // target: MascotaDTO
    // No hay anotaciones porque la conversión es uno a uno, es decir
    // Mascota.id -> MascotaDTO.id
    // Mascota.name -> MascotaDTO.name
    MascotaDTO toDTO(Mascota model);

    // source: CreateMascotaDTO -> Objeto de entrada
    // target: Mascota -> Objeto de salida

    // En el target se va a ignorar el campo "id"
    @Mapping(target = "id", ignore = true)
    // "stock" en el source pasa a ser "quantity" en el target
    @Mapping(source = "stock", target = "quantity")
    Mascota toModel(CreateMascotaDTO dto);
    
}