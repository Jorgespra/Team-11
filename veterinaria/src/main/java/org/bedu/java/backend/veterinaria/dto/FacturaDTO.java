package org.bedu.java.backend.veterinaria.dto;

import java.util.List;

import org.bedu.java.backend.veterinaria.model.Medicamento;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FacturaDTO {
    private long id;
    private String servicio;
    
    private List<Medicamento> medicamentos;
    private String detalle;
    private int cantidad;
    private double costo;

}
