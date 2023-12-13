package org.bedu.java.backend.veterinaria.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FacturaDTO {
    @Schema(description = "Identificador de la factura", example = "1")
    private long id;
    @Schema(description = "Subtotal de la factura", example = "150.25")
    private double sub_total;
    @Schema(description = "Valor del IVA cuando se realizo la venta", example = "0.16")
    private double iva;
    @Schema(description = "Valor calculado en base al subtotal y al iva", example = "174.29")
    private double total;
    @Schema(description = "RFC el cliente")
    private String rfc_cliente;
    private String razon_social;

}
