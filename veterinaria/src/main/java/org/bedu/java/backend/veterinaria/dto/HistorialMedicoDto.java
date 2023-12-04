package org.bedu.java.backend.veterinaria.dto;

import java.time.LocalDate;

import org.bedu.java.backend.veterinaria.model.Veterinario;
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
    private long id;
    
    @NotNull
    private Veterinario doctor;

    @NotNull
    private Mascota mascota;
    
    @NotNull
    private LocalDate fechaConsulta;
    
    @NotBlank(message = "El diagnóstico no puede estar en blanco")
    private String diagnostico;

    @NotBlank(message = "El tratamiento no puede estar en blanco")
    private String tratamientoActual;

    private String medicamentosRecetados;

    private String resultadoPruebas;
    
    private String observaciones;
    
}
