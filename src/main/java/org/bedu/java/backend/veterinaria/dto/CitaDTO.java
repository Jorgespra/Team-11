package org.bedu.java.backend.veterinaria.dto;

import lombok.Data;
import org.bedu.java.backend.veterinaria.model.Mascota;
import org.bedu.java.backend.veterinaria.model.Veterinario;

import java.time.LocalDate;
import java.time.LocalTime;


@Data
public class CitaDTO {

    private long id;
    private Veterinario veterinario;
    private Mascota mascota;
    private String motivoDelaConsulta;
    private LocalDate fechaConsulta;
    private LocalTime hora;

}


