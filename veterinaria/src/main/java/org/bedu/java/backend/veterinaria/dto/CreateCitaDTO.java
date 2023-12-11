package org.bedu.java.backend.veterinaria.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.bedu.java.backend.veterinaria.model.Mascota;
import org.bedu.java.backend.veterinaria.model.Veterinario;

import java.time.LocalDate;
import java.time.LocalTime;


@Data
public class CreateCitaDTO {

    @NotBlank
    private Veterinario veterinario;
    @NotBlank
    private Mascota mascota;
    @NotBlank
    private String motivoDelaConsulta;
    @NotBlank
    private LocalDate fechaConsulta;
    @NotBlank
    private LocalTime hora;




}
