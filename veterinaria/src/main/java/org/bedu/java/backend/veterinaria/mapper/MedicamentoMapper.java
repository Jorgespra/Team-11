package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.CreateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.MedicamentoDTO;
import org.bedu.java.backend.veterinaria.model.Medicamento;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MedicamentoMapper {
    MedicamentoDTO toDTO(Medicamento model);

    @Mapping(target = "id", ignore = true)
    @Mapping(source = "caducidad", target="fechaCaducidad")
    Medicamento toModel(CreateMedicamentoDTO dto);
}
