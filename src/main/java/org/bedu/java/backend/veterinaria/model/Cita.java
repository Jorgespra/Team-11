package org.bedu.java.backend.veterinaria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "citas")

public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false, length = 50)
    private String vetName;
    @Column(nullable = false, length = 50)
    private String petName;
    @Column(nullable = false, length = 200)
    private String dueAppointment;
    @Column (nullable = false)
    private Date dayAppointment;
    @Column (nullable = false)
    private Time hourAppointment;


}
