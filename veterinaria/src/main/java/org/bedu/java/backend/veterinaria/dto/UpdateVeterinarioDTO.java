package org.bedu.java.backend.veterinaria.dto;

import java.time.LocalTime;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateVeterinarioDTO {
    

    @Schema(description = "Nombre del veterinario", example = "Alberto")
    @NotBlank
    private String nombre;

    @Schema(description = "Apellido paterno del veterinario", example = "Juarez")
    @NotBlank
    private String apellidoPaterno;

    @Schema(description = "Apellido materno del veterinario", example = "Hernandez")
    @NotBlank
    private String apellidoMaterno;

    @Schema(description = "Fecha de nacimiento del veterinario", example = "1998-12-25")
    private Date fechaNacimiento;

    @Schema(description = "Numero de celular del veterinario", example = "+528332587821")
    private String celular;

    @Schema(description = "Correo electronico del veterinario", example = "albertoHerdJua@gmail.com")
    private String correo;

    @Schema(description = "Especialidad del veterinario", example = "odontologia")
    private String especialidad;

    @Schema(description = "Hora de entrada del veterinario", example = "09:25")
    private LocalTime horaEntrada;

    @Schema(description = "Hora de salida del veterinario", example = "18:15")
    private LocalTime horaSalida;
}
