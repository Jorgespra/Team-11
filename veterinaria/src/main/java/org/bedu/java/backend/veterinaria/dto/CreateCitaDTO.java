package org.bedu.java.backend.veterinaria.dto;


import java.sql.Time;
import java.util.Date;

public class CreateCitaDTO {
    private String vetName;
    private String petName;
    private String dueAppointment;
    private Date dayAppointment;
    private Time hourAppointmet;


    public String getVetName() {
        return vetName;
    }
    public void setVetName(String vetName) {
        this.vetName = vetName;
    }
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }
    public String getDueAppointment() {
        return dueAppointment;
    }
    public void setDueAppointment(String dueAppointment) {
        this.dueAppointment = dueAppointment;
    }
    public Date getDayAppointment() {
        return dayAppointment;
    }
    public void setDayAppointment(Date dayAppointment) {
        this.dayAppointment = dayAppointment;
    }
    public Time getHourAppointmet() {
        return hourAppointmet;
    }
    public void setHourAppointmet(Time hourAppointmet) {
        this.hourAppointmet = hourAppointmet;
    }

    

}
