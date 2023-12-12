package org.bedu.java.backend.veterinaria.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.bedu.java.backend.veterinaria.model.Mascota;
import org.bedu.java.backend.veterinaria.model.Veterinario;

import java.time.LocalDate;
import java.time.LocalTime;


@Data
public class CitaDTO {

    @Schema (description = "Identificador de la cita", example = "30")
    private long id;
    @Schema (description = "Motivo de la consulta", example = "Estetica, Urgencia, Vacunacion")
    private String motivoDelaConsulta;
    @Schema(description = "Fecha en la que se agenda la cita", example = "dd/mm/aaaa")
    private LocalDate fechaConsulta;
    @Schema(description = "Hora agendada", example = "hh:mm")
    private LocalTime hora;

}


