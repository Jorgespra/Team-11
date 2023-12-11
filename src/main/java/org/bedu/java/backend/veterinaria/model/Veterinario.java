package org.bedu.java.backend.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "veterinario")

    public class Veterinario {

    @Id
    private long id;
    private String nombreVeterinario;
    private String apellidoVeterinario;
    private String fecha_nacimientoVeterinario;
    private long celularVeterinario;
    private String correoVeterinario;
    private String especialidadVeterinario;
    private String hora_entradaVeterinario;
    private String hora_salidaVeterinario;

}
