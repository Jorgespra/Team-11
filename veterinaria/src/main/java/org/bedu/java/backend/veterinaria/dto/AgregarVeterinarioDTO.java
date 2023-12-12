package org.bedu.java.backend.veterinaria.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AgregarVeterinarioDTO {
    @Schema(description = "Nombre del Veterinario", example = "Juan Palomo")
    @NotBlank
    private String nombre;


}
