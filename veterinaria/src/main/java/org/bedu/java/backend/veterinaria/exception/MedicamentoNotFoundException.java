package org.bedu.java.backend.veterinaria.exception;

public class MedicamentoNotFoundException extends RuntimeException {
    public MedicamentoNotFoundException(long medicamentoId) {
        super("ERR_DATA_NOT_FOUND", "No se encontró el medicamento especificado", medicamentoId);
    }
}
