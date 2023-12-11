package org.bedu.java.backend.veterinaria.dto;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/*
 * @Data es la unión de:
 *  - @Getter
 *  - @Setter
 *  - @ToString
 *  - @EqualsAndHashCode <-- Podría tener conflictos con otras librerias, por ejemplo JPA
 *  - @RequiredArgsConstructor
 */
@Data
public class CreateMascotaDTO {

    // private long id;

    @Schema(description = "Nombre de la mascota", example = "Rex")
    @NotBlank(message = "El nombre de la mascota es obligatorio")
    @Length(min = 1, max = 100, message = "El nombre no puede exceder de 100 caracteres")
    private String nombre;

    @Schema(description = "Nombre de la especie", example = "Perico")
    @NotBlank(message = "El nombre de la especie es obligatorio")
    @Length(min = 1, max = 40, message = "La descripción de la especie no puede exceder de 40 caracteres")
    private String especie;

    @Schema(description = "Raza de la mascota", example = "Loro Eclectus")
    @NotBlank(message = "El nombre de la raza es obligatorio")
    @Length(min = 1, max = 60, message = "La descripción de la raza no puede exceder de 60 caracteres")
    private String raza;

    @Schema(description = "Edad de la mascota en años", example = "1")
    @Min(value = 1, message = "La edad debe ser mayor a cero")
    private int edad;

    @Schema(description = "Altura de la mascota en metros", example = "0.5")
    @DecimalMin(value = "0.1", message = "La altura debe ser mayor a cero")
    private float altura;

    @Schema(description = "Peso de la mascota en Kg", example = "0.3")
    @DecimalMin(value = "0.1", message = "El peso debe ser mayor a cero")
    private float peso;

    @Schema(description = "Sexo de la mascota (Macho/Hembra)", example = "Macho")
    @NotBlank(message = "Por favor ingrese el sexo de la mascota")
    @Length(min = 1, max = 20, message = "La descripción del sexo debe ser entre 1 y 20 caracteres")
    private String sexo;

    @Schema(description = "Color de la mascota", example = "Negro con rayas blancas")
    @NotBlank(message = "El color de la mascota es obligatorio")
    @Length(min = 1, max = 50, message = "La descripción del color debe ser entre 1 y 50 caracteres")
    private String color;
}
