package org.bedu.java.backend.veterinaria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MascotaDTO {
    private int id;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;

}