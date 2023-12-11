package org.bedu.java.backend.veterinaria.model;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
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
    private long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 40)
    private String especie;

    @Column(nullable = false, length = 60)
    private String raza;

    @Range(min = 1, max = 200)
    private int edad;

    @DecimalMin(value = "0.01")
    private float altura;

    @DecimalMin(value = "0.01")
    private float peso;

    @Column(nullable = false, length = 20)
    private String sexo;

    @Column(nullable = false, length = 50)
    private String color;
}
