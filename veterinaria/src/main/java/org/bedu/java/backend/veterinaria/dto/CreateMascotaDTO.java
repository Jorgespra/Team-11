package org.bedu.java.backend.veterinaria.dto;

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

    // private int id;

    @NotBlank(message = "El nombre de la mascota es obligatorio")
    private String nombre;

    @NotBlank(message = "El nombre de la especie es obligatorio")
    private String especie;

    @NotBlank(message = "El nombre de la raza es obligatorio")
    private String raza;

    @Min(value = 1, message = "La edad debe ser mayor a cero")
    private int edad;
}
