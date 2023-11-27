package org.bedu.citas.dto;

import jakarta.validation.constraints.NotBlank;

import java.sql.Time;
import java.util.Date;

public class CreateCitaDTO {


    @NotBlank
    private String VetName;
    private String PetName;
    private String DueAppointment;
    private Date DayAppointment;
    private Time HourAppointmet;

    public String getVetName() {
        return VetName;
    }

    public void setVetName(String vetName) {
        VetName = vetName;
    }

    public String getPetName() {
        return PetName;
    }

    public void setPetName(String petName) {
        PetName = petName;
    }

    public String getDueAppointment() {
        return DueAppointment;
    }

    public void setDueAppointment(String dueAppointment) {
        DueAppointment = dueAppointment;
    }

    public Date getDayAppointment() {
        return DayAppointment;
    }

    public void setDayAppointment(Date dayAppointment) {
        DayAppointment = dayAppointment;
    }

    public Time getHourAppointmet() {
        return HourAppointmet;
    }

    public void setHourAppointmet(Time hourAppointmet) {
        HourAppointmet = hourAppointmet;
    }

    public CreateCitaDTO(String vetName, String petName, String dueAppointment, Date dayAppointment, Time hourAppointmet) {
        VetName = vetName;
        PetName = petName;
        DueAppointment = dueAppointment;
        DayAppointment = dayAppointment;
        HourAppointmet = hourAppointmet;
    }


}
