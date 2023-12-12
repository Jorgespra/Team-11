package org.bedu.java.backend.veterinaria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table(name = "citas")

public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 200)
    private MotivoCita motivoDelaConsulta;
    @Column (nullable = false)
    private LocalDate fechaConsulta;
    @Column (nullable = false)
    private LocalTime hora;






}
