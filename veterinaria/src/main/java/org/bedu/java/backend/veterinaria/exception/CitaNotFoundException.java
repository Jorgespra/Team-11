package org.bedu.java.backend.veterinaria.exception;

public class CitaNotFoundException extends RuntimeException {

    public CitaNotFoundException (long citaId) {
        super("ERR_DATA_NOT_FOUND", "No se encontró la cita", citaId);
    }


}
