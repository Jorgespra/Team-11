package org.bedu.java.backend.veterinaria.dto;

import lombok.Data;

import java.util.Date;

@Data
public class VeterinarioDTO {

    private long id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    private long celular;
    private String correo;
    private String especialidad;
    private String horaEntrada;
    private String horaSalida;

}
