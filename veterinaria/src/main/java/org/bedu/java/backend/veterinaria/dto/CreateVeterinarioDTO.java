package org.bedu.java.backend.veterinaria.dto;

import java.time.LocalTime;
import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.v3.oas.annotations.media.Schema;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateVeterinarioDTO {
    
    @Schema(description = "Nombre del veterinario", example = "Alberto")
    @NotBlank(message = "El nombre del veterinario es obligatorio")
    @Length(min = 1, max = 100, message = "El nombre no puede exceder de 100 caracteres")
    private String nombre;

    @Schema(description = "Apellido paterno del veterinario", example = "Juarez")
    @NotBlank(message = "El apellido paterno del veterinario es obligatorio")
    @Length(min = 1, max = 100, message = "El apellido paterno no puede exceder de 100 caracteres")
    private String apellidoPaterno;

    @Schema(description = "Apellido materno del veterinario", example = "Hernandez")
    @NotBlank(message = "El apellido materno del veterinario es obligatorio")
    @Length(min = 1, max = 100, message = "El apellido materno no puede exceder de 100 caracteres")
    private String apellidoMaterno;

    @Schema(description = "Fecha de nacimiento del veterinario", example = "1998-12-25")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;

    @Schema(description = "Numero de celular del veterinario", example = "+528331593654")
    @NotBlank(message = "El numero de celular del veterinario es obligatorio")
    @Length(min = 1, max = 100, message = "El numero de celular no puede exceder de 13 caracteres")
    private String celular;

    @Schema(description = "Correo electronico del veterinario", example = "albertojuHrd@gmail.com")
    @NotBlank(message = "El correo electronico del veterinario es obligatorio")
    @Length(min = 1, max = 100, message = "El correo electronico no puede exceder de 100 caracteres")
    private String correo;

    @Schema(description = "Especialidad del veterinario", example = "Odontologia")
    @NotBlank(message = "La especialidad del veterinario es obligatorio")
    @Length(min = 1, max = 100, message = "La especialidad no puede exceder de 100 caracteres")
    private String especialidad;

    @Schema(description = "Hora de entrada del veterinario", example = "09:25")
    private LocalTime horaEntrada;

    @Schema(description = "Hora de salida del veterinario", example = "18:15")
    private LocalTime horaSalida;

}
