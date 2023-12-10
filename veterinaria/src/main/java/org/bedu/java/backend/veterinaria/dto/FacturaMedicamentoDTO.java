package org.bedu.java.backend.veterinaria.dto;

import lombok.Data;

@Data
public class FacturaMedicamentoDTO {
    private long medicamentoId;
    private int cantidad;
    private double precio;
}
