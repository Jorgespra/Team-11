package org.bedu.java.backend.veterinaria.exception;

public class MascotaNotFoundException extends RuntimeException {
    public MascotaNotFoundException(Long mascotaId) {
        super("ERR_DATA_NOT_FOUND", "No se encontró la mascota especificada", mascotaId);
    }
}