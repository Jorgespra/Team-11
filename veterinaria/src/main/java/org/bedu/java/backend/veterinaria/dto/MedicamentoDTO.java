package org.bedu.java.backend.veterinaria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
public class MedicamentoDTO {

    private long id;
    private String nombre;
    private String clasificacion;
    private String descripcion;
    private Date fechaCaducidad;
    private int existencia;
    private float precio;
    private String instruccionesUso;

}
