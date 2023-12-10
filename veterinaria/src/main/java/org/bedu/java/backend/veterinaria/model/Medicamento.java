package org.bedu.java.backend.veterinaria.model;

// import lombok.AllArgsConstructor;
// import lombok.Data;

// @Data
// @AllArgsConstructor

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "medicamentos")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String clasificacion;

    @Column(nullable = false)
    private String descripcion;

    @Column(name = "fecha_caducidad", nullable = false)
    private Date fechaCaducidad;

    @Column
    @Range(min = 0)
    private int existencia;

    @Column
    @Range(min = 1)
    private float precio;

    @Column(name = "instrucciones_uso", nullable = false)
    private String instruccionesUso;

}
