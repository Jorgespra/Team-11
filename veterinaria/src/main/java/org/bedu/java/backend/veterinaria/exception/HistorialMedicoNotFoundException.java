package org.bedu.java.backend.veterinaria.exception;

public class HistorialMedicoNotFoundException extends RuntimeException{

    public HistorialMedicoNotFoundException(long id) {
        super("ERR_Historial_NOT_FOUND", "El historial medico no existe", id);
    }

}
