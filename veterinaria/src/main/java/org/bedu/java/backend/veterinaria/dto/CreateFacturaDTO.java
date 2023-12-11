package org.bedu.java.backend.veterinaria.dto;


import jakarta.validation.constraints.DecimalMin;

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

    @DecimalMin(value = "0.01", message = "El sub Total debe ser mayor o igual que 0.01")
    private double sub_total;


    @DecimalMin(value = "0.01", message = "El IVA debe ser mayor o igual que 0.01")
    private double iva;

    
    @NotBlank(message = "Se debe incluir descripcion del servicio")
    private String rfc_cliente;

    @NotBlank(message = "Se debe incluir descripcion del servicio")
    private String razon_social;

}