package org.bedu.java.backend.veterinaria.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

@Getter
@Setter
@ToString
@Entity
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


