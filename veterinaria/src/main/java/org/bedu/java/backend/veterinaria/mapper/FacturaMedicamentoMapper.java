package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.model.FacturaMedicamento;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface FacturaMedicamentoMapper {
    
    @Mapping(source = "facturaId", target = "id.facturaId")
    @Mapping(source = "facturaId", target = "factura.id")
    @Mapping(source = "medicamentoId", target = "id.medicamentoId")
    @Mapping(source = "medicamentoId", target = "medicamento.id")
    FacturaMedicamento toModel(Long facturaId, Long medicamentoId);
}
