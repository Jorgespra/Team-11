package org.bedu.java.backend.veterinaria.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.sql.Time;
import java.util.Date;


@Data
public class CreateCitaDTO {

    @NotBlank
    private String vetName;
    @NotBlank
    private String petName;
    @NotBlank
    private String dueAppointment;
    @NotBlank
    private Date dayAppointment;
    @NotBlank
    private Time hourAppointment;




}
