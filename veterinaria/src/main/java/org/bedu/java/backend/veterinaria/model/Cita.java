package org.bedu.java.backend.veterinaria.model;

import java.sql.Time;
import java.util.Date;

public class Cita {

    private long id;
    private String vetName;
    private String petName;
    private String dueAppointment;
    private Date dayAppointment;
    private Time hourAppointmet;

    public Cita(long id, String vetName, String petName, String dueAppointment, Date dayAppointment,
            Time hourAppointmet) {
        this.id = id;
        this.vetName = vetName;
        this.petName = petName;
        this.dueAppointment = dueAppointment;
        this.dayAppointment = dayAppointment;
        this.hourAppointmet = hourAppointmet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
