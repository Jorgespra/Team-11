package org.bedu.java.backend.veterinaria.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Data
public class UpdateMedicamentoDTO {
    @Schema(description = "Nombre del medicamento", example = "Doxiciclina")
    private String nombre;

    @Schema(description = "Clasificación o tipo de medicamento", example = "Antibióticos")
    private String clasificacion;

    @Schema(description = "Descripción del medicamento", example = "Útil para tratar enfermedades transmitidas por garrapatas y enfermedades respiratorias.")
    private String descripcion;

    @Schema(description = "Fecha en la que caduca el medicamento", example = "2025-01-01")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaCaducidad;

    @Schema(description = "Cantidad de medicamentos en existencia", example = "100")
    @Min(value = 1, message = "La cantidad o existencia del medicamento debe ser mayor o igual que 1")
    private int existencia;

    @Schema(description = "Precio del medicamento", example = "125.50")
    @DecimalMin(value = "0.0", message = "El precio del medicamento debe ser mayor o igual que 0.0")
    private float precio;

    @Schema(description = "Instrucciones de uso del medicamento", example = "Por lo general, se administra de 2 a 5 mg por kg de peso corporal cada 12 o 24 horas.")
    private String instruccionesUso;
}
