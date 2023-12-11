package org.bedu.java.backend.veterinaria.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
public class MedicamentoDTO {

    @Schema(description = "Identificador del medicamento", example = "100")
    private long id;

    @Schema(description = "Nombre del medicamento", example = "Doxiciclina")
    private String nombre;

    @Schema(description = "Clasificación o tipo de medicamento", example = "Antibióticos")
    private String clasificacion;

    @Schema(description = "Descripción del medicamento", example = "Útil para tratar enfermedades transmitidas por garrapatas y enfermedades respiratorias.")
    private String descripcion;

    @Schema(description = "Fecha en la que caduca el medicamento", example = "2025-01-01")
    private LocalDate fechaCaducidad;

    @Schema(description = "Cantidad de medicamentos en existencia", example = "100")
    private int existencia;

    @Schema(description = "Precio del medicamento", example = "125.50")
    private float precio;

    @Schema(description = "Instrucciones de uso del medicamento", example = "Por lo general, se administra de 2 a 5 mg por kg de peso corporal cada 12 o 24 horas.")
    private String instruccionesUso;

}
