package org.bedu.java.backend.veterinaria.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

public class CreatefacturasDTO {
    @NotBlank(message = "Los detalles de la facura son obligatorios")
    private String detalles;
    @NotBlank(message = "Los detalles del servicio  son obligatorios")
    private String servicios;
    @NotBlank(message = "Los medicamentos son obligatorios")
    private String medicamentos;
    @DecimalMin(value = "1.0", message = "Se debe de facturar una cantidad mayor a cero")
    private double costo;

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
