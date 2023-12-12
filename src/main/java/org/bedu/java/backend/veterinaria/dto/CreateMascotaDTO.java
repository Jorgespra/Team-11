package org.bedu.java.backend.veterinaria.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateMascotaDTO {
    @Schema(description = "nombre de la mascota", example = "Pelusa")
    @NotBlank
    private String nombre;
    @NotBlank
    private String especie;
    @NotBlank
    private String raza;
    @Min(1)
    private int edad;
}
