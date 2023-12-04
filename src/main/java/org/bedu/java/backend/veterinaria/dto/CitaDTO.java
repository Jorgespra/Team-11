package org.bedu.java.backend.veterinaria.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.sql.Time;
import java.util.Date;


@Data
public class CitaDTO {

    private long id;
    private String vetName;
    private String petName;
    private String dueAppointment;
    private Date dayAppointment;
    private Time hourAppointment;

}


