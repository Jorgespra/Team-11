package org.bedu.java.backend.veterinaria.model;

public class VeterinarioModel {

    private long id;
    private String nombreVeterinario;
    private String apellidoVeterinario;
    private String fecha_nacimientoVeterinario;
    private long celularVeterinario;
    private String correoVeterinario;
    private String especialidadVeterinario;
    private String hora_entradaVeterinario;
    private String hora_salidaVeterinario;

    public VeterinarioModel(long id, String nombreVeterinario, String apellidoVeterinario,
            String fecha_nacimientoVeterinario, long celularVeterinario, String correoVeterinario,
            String especialidadVeterinario, String hora_entradaVeterinario, String hora_salidaVeterinario) {
        this.id = id;
        this.nombreVeterinario = nombreVeterinario;
        this.apellidoVeterinario = apellidoVeterinario;
        this.fecha_nacimientoVeterinario = fecha_nacimientoVeterinario;
        this.celularVeterinario = celularVeterinario;
        this.correoVeterinario = correoVeterinario;
        this.especialidadVeterinario = especialidadVeterinario;
        this.hora_entradaVeterinario = hora_entradaVeterinario;
        this.hora_salidaVeterinario = hora_salidaVeterinario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }

    public String getApellidoVeterinario() {
        return apellidoVeterinario;
    }

    public void setApellidoVeterinario(String apellidoVeterinario) {
        this.apellidoVeterinario = apellidoVeterinario;
    }

    public String getFecha_nacimientoVeterinario() {
        return fecha_nacimientoVeterinario;
    }

    public void setFecha_nacimientoVeterinario(String fecha_nacimientoVeterinario) {
        this.fecha_nacimientoVeterinario = fecha_nacimientoVeterinario;
    }

    public long getCelularVeterinario() {
        return celularVeterinario;
    }

    public void setCelularVeterinario(long celularVeterinario) {
        this.celularVeterinario = celularVeterinario;
    }

    public String getCorreoVeterinario() {
        return correoVeterinario;
    }

    public void setCorreoVeterinario(String correoVeterinario) {
        this.correoVeterinario = correoVeterinario;
    }

    public String getEspecialidadVeterinario() {
        return especialidadVeterinario;
    }

    public void setEspecialidadVeterinario(String especialidadVeterinario) {
        this.especialidadVeterinario = especialidadVeterinario;
    }

    public String getHora_entradaVeterinario() {
        return hora_entradaVeterinario;
    }

    public void setHora_entradaVeterinario(String hora_entradaVeterinario) {
        this.hora_entradaVeterinario = hora_entradaVeterinario;
    }

    public String getHora_salidaVeterinario() {
        return hora_salidaVeterinario;
    }

    public void setHora_salidaVeterinario(String hora_salidaVeterinario) {
        this.hora_salidaVeterinario = hora_salidaVeterinario;
    }


    



    

    
    
}
