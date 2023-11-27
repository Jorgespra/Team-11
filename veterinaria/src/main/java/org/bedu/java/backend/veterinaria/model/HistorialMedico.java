package org.bedu.java.backend.veterinaria.model;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


public class HistorialMedico {

    @Positive(message = "El identificador no puede ser un número negativo o cero")
    private long id;
    /*
     * @NotNull:
     * Propósito: Garantiza que el valor no sea nulo.
     * Para comprobar si hay un objeto.
     */
    @NotNull
    private DoctorModel doctor;

    @NotNull
    private Mascota mascota;
    
    @NotNull
    private LocalDate fechaConsulta;
    
    @NotBlank(message = "El diagnóstico no puede estar en blanco")
    private String diagnostico;

    @NotBlank(message = "El tratamiento no puede estar en blanco")
    private String tratamientoActual;

    private String medicamentosRecetados;

    private String resultadoPruebas;
    
    private String observaciones;

    public HistorialMedico() {

    }


    public HistorialMedico(long id, DoctorModel doctor, Mascota mascota, LocalDate fechaConsulta, String diagnostico,
            String tratamientoActual, String medicamentosRecetados, String resultadoPruebas, String observaciones) {
        this.id = id;
        this.doctor = doctor;
        this.mascota = mascota;
        this.fechaConsulta = fechaConsulta;
        this.diagnostico = diagnostico;
        this.tratamientoActual = tratamientoActual;
        this.medicamentosRecetados = medicamentosRecetados;
        this.resultadoPruebas = resultadoPruebas;
        this.observaciones = observaciones;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DoctorModel getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorModel doctor) {
        this.doctor = doctor;
    }
    
    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(LocalDate fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamientoActual() {
        return tratamientoActual;
    }

    public void setTratamientoActual(String tratamientoActual) {
        this.tratamientoActual = tratamientoActual;
    }

    public String getMedicamentosRecetados() {
        return medicamentosRecetados;
    }

    public void setMedicamentosRecetados(String medicamentosRecetados) {
        this.medicamentosRecetados = medicamentosRecetados;
    }

    public String getResultadoPruebas() {
        return resultadoPruebas;
    }

    public void setResultadoPruebas(String resultadoPruebas) {
        this.resultadoPruebas = resultadoPruebas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    public Mascota getMascota() {
        return mascota;
    }


    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
