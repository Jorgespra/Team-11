package org.bedu.java.backend.veterinaria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@Entity
@Table(name = "citas")

public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "veterinario_id", nullable = false)
    private Veterinario veterinario;

    @ManyToOne
    @JoinColumn (name = "mascota_id", nullable = false)
   private Mascota mascota;

    @Column(nullable = false, length = 200)
    private String motivoDelaConsulta;
    @Column (nullable = false)
    private LocalDate fechaConsulta;
    @Column (nullable = false)
    private LocalTime hora;


}
