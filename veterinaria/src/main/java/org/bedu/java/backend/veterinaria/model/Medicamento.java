package org.bedu.java.backend.veterinaria.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.validator.constraints.Range;

import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "medicamento")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String clasificacion;

    @Column(nullable = false)
    private String descripcion;

    @Column(name = "fecha_caducidad", nullable = false)
    private Date fechaCaducidad;

    @Column(nullable = false)
    @Range(min = 0)
    private int existencia;

    @Column(nullable = false)
    @Range(min = 1)
    private float precio;

    @Column(name = "instrucciones_uso", nullable = false)
    private String instruccionesUso;

}
