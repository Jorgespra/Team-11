package org.bedu.java.backend.veterinaria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FacturaDTO {

    private long id;
    private double sub_total;
    private double iva;
    private double total;
    private String rfc_cliente;
    private String razon_social;

}
