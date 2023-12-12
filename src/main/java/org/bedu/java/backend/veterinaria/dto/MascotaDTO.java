package org.bedu.java.backend.veterinaria.dto;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MascotaDTO {

    @Id
    private int id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String especie;
    @NotBlank
    private String raza;
    @Min(1)
    private int edad;



}
