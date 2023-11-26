package org.bedu.java.backend.veterinaria.model;

import java.time.LocalDate;

public class HistorialMedico {

    private long id;

    private DoctorModel doctor;

    private Paciente paciente;
    
    private LocalDate fechaConsulta;

    private String diagnostico;

    private String tratamientoActual;

    private String medicamentosRecetados;

    private String resultadoPruebas;

    private String observaciones;

    public HistorialMedico() {

    }


    public HistorialMedico(long id, DoctorModel doctor, Paciente paciente, LocalDate fechaConsulta, String diagnostico,
            String tratamientoActual, String medicamentosRecetados, String resultadoPruebas, String observaciones) {
        this.id = id;
        this.doctor = doctor;
        this.paciente = paciente;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
    


    


    
}
