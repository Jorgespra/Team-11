package org.bedu.java.backend.veterinaria.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MascotaDTO {
    private long id;

    @Schema(description = "Nombre de la mascota", example = "Rex")
    private String nombre;

    @Schema(description = "Nombre de la especie", example = "Perico")
    private String especie;

    @Schema(description = "Raza de la mascota", example = "Loro Eclectus")
    private String raza;

    @Schema(description = "Edad de la mascota en años", example = "1")
    private int edad;

    @Schema(description = "Altura de la mascota en metros", example = "0.5")
    private float altura;

    @Schema(description = "Peso de la mascota en Kg", example = "0.3")
    private float peso;

    @Schema(description = "Sexo de la mascota (Macho/Hembra)", example = "Macho")
    private String sexo;

    @Schema(description = "Color de la mascota", example = "Negro con rayas blancas")
    private String color;

}