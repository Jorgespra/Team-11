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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "mascota")

public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String especie;

    @Column(nullable = false, length = 100)
    private String raza;

    @Range(min = 1, max = 200)
    private int edad;
}
