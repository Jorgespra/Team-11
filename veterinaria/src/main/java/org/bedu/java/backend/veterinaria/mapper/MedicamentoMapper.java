package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.CreateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.MedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.model.Medicamento;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface MedicamentoMapper {

    MedicamentoDTO toDTO(Medicamento model);

    List<MedicamentoDTO> toDTO(List<Medicamento> model);

    @Mapping(target = "id", ignore = true)
    Medicamento toModel(CreateMedicamentoDTO dto);

    @Mapping(target = "id", ignore = true)
    void update(@MappingTarget Medicamento medicamento, UpdateMedicamentoDTO data);

}
