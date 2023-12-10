package org.bedu.java.backend.veterinaria.exception;

public class FacturaNotFound extends RuntimeException {
    public FacturaNotFound(long facturaId) {
        super("ERR_DATA_NOT_FOUND", "No se encontró la facrura especificada", facturaId);
    }
}
