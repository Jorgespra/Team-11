package org.bedu.java.backend.veterinaria.dto;

import java.time.LocalDate;

import org.bedu.java.backend.veterinaria.model.Veterinario;

import io.swagger.v3.oas.annotations.media.Schema;

import org.bedu.java.backend.veterinaria.model.Mascota;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistorialMedicoDto {

    @Schema(description = "ID del historial médico", example = "1")
    private Long id;

    @Schema(description = "Veterinario asociado al historial médico", required = true)
    @NotNull(message = "El campo 'veterinario' no puede ser nulo")
    private Veterinario veterinario;

    @Schema(description = "Mascota asociada al historial médico", required = true)
    @NotNull(message = "El campo 'mascota' no puede ser nulo")
    private Mascota mascota;

    @Schema(description = "Fecha de la consulta", required = true, example = "2023-11-25")
    @NotNull(message = "El campo 'fechaConsulta' no puede ser nulo")
    private LocalDate fechaConsulta;

    @Schema(description = "Diagnóstico de la consulta", required = true, example = "Fiebre y tos")
    @NotBlank(message = "El diagnóstico no puede estar en blanco")
    private String diagnostico;

    @Schema(description = "Tratamiento actual", required = true, example = "Tomar medicamento X cada 8 horas")
    @NotBlank(message = "El tratamiento no puede estar en blanco")
    private String tratamientoActual;

    @Schema(description = "Medicamentos recetados", example = "Medicamento Y, 1 comprimido cada 12 horas")
    private String medicamentosRecetados;

    @Schema(description = "Resultado de pruebas realizadas", example = "Negativo")
    private String resultadoPruebas;

    @Schema(description = "Observaciones adicionales", example = "Seguimiento requerido")
    private String observaciones;

}
