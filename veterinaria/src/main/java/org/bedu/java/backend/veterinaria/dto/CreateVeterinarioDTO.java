package org.bedu.java.backend.veterinaria.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class CreateVeterinarioDTO {

    @NotBlank(message = "El nombre del veterinario es obligatorio")
    private String nombre;

    @NotBlank(message = "El apellido paterno del veterinario es obligatorio")
    private String apellidoPaterno;

    @NotBlank(message = "El apellido materno del veterinario es obligatorio")
    private String apellidoMaterno;

    @NotNull(message = "La fecha de nacimiento del veterinario no puede ser nula")
    private Date fechaNacimiento;

    @NotNull(message = "El número de celular del veterinario no puede ser nulo")
    private long celular;

    //@NotBlank(message = "El correo del veterinario es obligatorio")
    @Email(message = "Verifique el correo sea válido")
    private String correo;

    @NotBlank(message = "La especialidad del veterinario es obligatoria")
    private String especialidad;

    @NotBlank(message = "La hora de entrada del veterinario es obligatoria")
    private String horaEntrada;

    @NotBlank(message = "El hora de salida del veterinario es obligatoria")
    private String horaSalida;

}
