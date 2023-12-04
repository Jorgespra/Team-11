package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.CreateFacturaDTO;
import org.bedu.java.backend.veterinaria.dto.FacturaDTO;
import org.bedu.java.backend.veterinaria.model.Factura;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface FacturaMapper {
    // source: Factura
    // target: FacturaDTO
    // No hay anotaciones porque la conversión es uno a uno, es decir
    // Factura.id -> FacturaDTO.id
    // Factura.name -> FacturaDTO.name
    FacturaDTO toDTO(Factura model);

    // source: CreateFacturaDTO -> Objeto de entrada
    // target: Factura -> Objeto de salida

    // En el target se va a ignorar el campo "id"
    @Mapping(target = "id", ignore = true)
    // "stock" en el source pasa a ser "quantity" en el target
    // @Mapping(source = "stock", target = "quantity")
    Factura toModel(CreateFacturaDTO dto);
    
}