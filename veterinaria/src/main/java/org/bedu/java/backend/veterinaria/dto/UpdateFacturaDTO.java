package org.bedu.java.backend.veterinaria.dto;

import lombok.Data;

@Data
public class UpdateFacturaDTO {

    private double sub_total;

    private double iva;

    private String rfc_cliente;

    private String razon_social;
}
