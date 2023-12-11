package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.CreateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.MedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.model.Medicamento;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MedicamentoMapper {

    MedicamentoDTO toDTO(Medicamento model);

    List<MedicamentoDTO> toDTO(List<Medicamento> model);

    @Mapping(target = "id", ignore = true)
    @Mapping(source = "caducidad", target="fechaCaducidad")
    @Mapping(source = "instrucciones", target="instruccionesUso")
    Medicamento toModel(CreateMedicamentoDTO dto);

    @Mapping(target = "id", ignore = true)
    @Mapping(source = "caducidad", target="fechaCaducidad")
    @Mapping(source = "instrucciones", target="instruccionesUso")
    void update(@MappingTarget Medicamento medicamento, UpdateMedicamentoDTO data);

}
