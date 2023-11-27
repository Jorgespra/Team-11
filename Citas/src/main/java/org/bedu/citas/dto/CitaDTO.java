package org.bedu.citas.dto;

import java.sql.Time;
import java.util.Date;

public class CitaDTO {


    private long id;
    private String VetName;
    private String PetName;
    private String DueAppointment;
    private Date DayAppointment;
    private Time HourAppointmet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public CitaDTO(long id, String vetName, String petName, String dueAppointment, Date dayAppointment, Time hourAppointmet) {
        this.id = id;
        VetName = vetName;
        PetName = petName;
        DueAppointment = dueAppointment;
        DayAppointment = dayAppointment;
        HourAppointmet = hourAppointmet;
    }
}


