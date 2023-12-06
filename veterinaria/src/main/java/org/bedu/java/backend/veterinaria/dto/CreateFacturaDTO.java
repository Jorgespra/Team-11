package org.bedu.java.backend.veterinaria.dto;

import java.util.List;

import org.bedu.java.backend.veterinaria.model.Medicamento;

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
public class CreateFacturaDTO {

    // private int id;

    @NotBlank(message = "Se debe incluir descripcion del servicio")
    private String servicio;

    @NotBlank(message = "Falta incluir detalles del producto o servicio")
    private String detalle;

    @Min(value = 1, message = "La edad debe ser mayor a cero")
    private int cantidad;

    @DecimalMin(value = "0.01", message = "El costo debe ser mayor o igual que 0.01")
    private double costo;

}