package org.bedu.java.backend.veterinaria.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mascota {
    private Long id;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;

    public Mascota(Long id, String nombre, String especie, String raza, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
    }
       
}
