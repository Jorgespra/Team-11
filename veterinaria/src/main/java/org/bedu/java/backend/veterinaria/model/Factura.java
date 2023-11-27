package org.bedu.java.backend.veterinaria.model;

public class Factura {
    private long id;
    private String detalles;
    private String servicios;
    private String medicamentos;
    private double costo;

    public Factura(long id, String detalles, String servicios, String medicamentos, double costo) {
        this.id = id;
        this.detalles = detalles;
        this.servicios = servicios;
        this.medicamentos = medicamentos;
        this.costo = costo;
    }

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
