package org.bedu.java.backend.veterinaria.model;

import java.util.Date;

public class Medicamento {
    private long id;
    private String nombre;
    private String clasificacion;
    private String descripcion;
    private Date fechaCaducidad;
    private int existencia;
    private float precio;
    private String instruccionesUso;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
