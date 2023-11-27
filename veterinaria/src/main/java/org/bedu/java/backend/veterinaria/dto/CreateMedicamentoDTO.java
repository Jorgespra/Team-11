package org.bedu.java.backend.veterinaria.dto;

import jakarta.validation.constraints.*;

import java.util.Date;

public class CreateMedicamentoDTO {
    @NotBlank(message = "El nombre del medicamento es obligatorio")
    private String nombre;
    @NotBlank(message = "La clasificación del medicamento es obligatoria")
    private String clasificacion;
    @NotBlank(message ="LA descripción del medicamento es obligatoria")
    private String descripcion;
    @NotNull(message = "La fecha de caducidad del medicamento no puede ser nula")
    private Date fechaCaducidad;
    @Min(value = 1, message = "La cantidad o existencia del medicamento debe ser mayor o igual que 1")
    private int existencia;
    @DecimalMin(value = "0.0", message = "El precio del medicamento debe ser mayor o igual que 0.0")
    private float precio;
    @NotBlank(message = "Las instrucciones de uso del medicamento son obligatorias")
    private String instruccionesUso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getInstruccionesUso() {
        return instruccionesUso;
    }

    public void setInstruccionesUso(String instruccionesUso) {
        this.instruccionesUso = instruccionesUso;
    }
}
