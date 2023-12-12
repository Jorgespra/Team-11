package org.bedu.java.backend.veterinaria.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class CreateCitaDTO {

    @Schema(description = "Motivo de la consulta", example = "Estetica, Urgencia, etc.")
    @NotBlank
    private String motivoDelaConsulta;
    @Schema(description = "Fecha de la consulta", example = "dd/mm/aaaa")
    @NotBlank
    private LocalDate fechaConsulta;
    @Schema(description = "Hora agendada", example = "hh:mm")
    @NotBlank
    private LocalTime hora;

}
