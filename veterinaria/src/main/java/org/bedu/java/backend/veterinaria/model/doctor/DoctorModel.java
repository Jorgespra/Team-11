package org.bedu.java.backend.veterinaria.model.doctor;

public class DoctorModel {

    private long id;
    private String nombreDoctor;
    private String apellidoDoctor;
    private String fecha_nacimientoDoctor;
    private long celularDoctor;
    private String correoDoctor;
    private String especialidadDoctor;
    private String hora_entradaDoctor;
    private String hora_salidaDoctor;

    public DoctorModel(long id, String nombreDoctor, String apellidoDoctor, String fecha_nacimientoDoctor,
            long celularDoctor, String correoDoctor, String especialidadDoctor, String hora_entradaDoctor,
            String hora_salidaDoctor) {
        this.id = id;
        this.nombreDoctor = nombreDoctor;
        this.apellidoDoctor = apellidoDoctor;
        this.fecha_nacimientoDoctor = fecha_nacimientoDoctor;
        this.celularDoctor = celularDoctor;
        this.correoDoctor = correoDoctor;
        this.especialidadDoctor = especialidadDoctor;
        this.hora_entradaDoctor = hora_entradaDoctor;
        this.hora_salidaDoctor = hora_salidaDoctor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getApellidoDoctor() {
        return apellidoDoctor;
    }

    public void setApellidoDoctor(String apellidoDoctor) {
        this.apellidoDoctor = apellidoDoctor;
    }

    public String getFecha_nacimientoDoctor() {
        return fecha_nacimientoDoctor;
    }

    public void setFecha_nacimientoDoctor(String fecha_nacimientoDoctor) {
        this.fecha_nacimientoDoctor = fecha_nacimientoDoctor;
    }

    public long getCelularDoctor() {
        return celularDoctor;
    }

    public void setCelularDoctor(long celularDoctor) {
        this.celularDoctor = celularDoctor;
    }

    public String getCorreoDoctor() {
        return correoDoctor;
    }

    public void setCorreoDoctor(String correoDoctor) {
        this.correoDoctor = correoDoctor;
    }

    public String getEspecialidadDoctor() {
        return especialidadDoctor;
    }

    public void setEspecialidadDoctor(String especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
    }

    public String getHora_entradaDoctor() {
        return hora_entradaDoctor;
    }

    public void setHora_entradaDoctor(String hora_entradaDoctor) {
        this.hora_entradaDoctor = hora_entradaDoctor;
    }

    public String getHora_salidaDoctor() {
        return hora_salidaDoctor;
    }

    public void setHora_salidaDoctor(String hora_salidaDoctor) {
        this.hora_salidaDoctor = hora_salidaDoctor;
    }


    
    
    
}
