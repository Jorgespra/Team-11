package org.bedu.java.backend.veterinaria.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class UpdateCitaDTO {
    @Schema(description = "motivo de la consulta", example = "Estetica, Urgencia, etc.")
    private String motivoDelaConsulta;
    @Schema(description = "Fecha en la que se agenda la cita", example = "dd/mm/aaaa")
    private LocalDate fechaConsulta;
    @Schema(description = "Hora agendada", example = "hh:mm")
    private LocalTime hora;

}
