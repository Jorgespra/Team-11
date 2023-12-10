package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.CreateFacturaDTO;
import org.bedu.java.backend.veterinaria.dto.FacturaDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateFacturaDTO;
import org.bedu.java.backend.veterinaria.model.Factura;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface FacturaMapper {
    FacturaDTO toDTO(Factura model);

    // source: CreateFacturaDTO -> Objeto de entrada
    // target: Factura -> Objeto de salida

    // En el target se va a ignorar el campo "id"
    @Mapping(target = "id", ignore = true)
    public Factura toModel(CreateFacturaDTO dto);


    @Mapping(target = "id", ignore = true)
    void update(@MappingTarget Factura factura, UpdateFacturaDTO data);
    
}