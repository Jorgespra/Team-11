package org.bedu.java.backend.veterinaria.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.util.Date;

@Data
public class CreateMedicamentoDTO {
    @NotBlank(message = "El nombre del medicamento es obligatorio")
    private String nombre;

    @NotBlank(message = "La clasificación del medicamento es obligatoria")
    private String clasificacion;

    @NotBlank(message ="LA descripción del medicamento es obligatoria")
    private String descripcion;

    @NotNull(message = "La fecha de caducidad del medicamento no puede ser nula")
    private Date caducidad; //se cambió a caducidad

    @Min(value = 1, message = "La cantidad o existencia del medicamento debe ser mayor o igual que 1")
    private int existencia;

    @DecimalMin(value = "0.0", message = "El precio del medicamento debe ser mayor o igual que 0.0")
    private float precio;

    @NotBlank(message = "Las instrucciones de uso del medicamento son obligatorias")
    private String instruccionesUso;

}
