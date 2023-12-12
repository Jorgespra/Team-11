package org.bedu.java.backend.veterinaria.exception;

public class VeterinarioNotFoundException extends RuntimeException{

    public VeterinarioNotFoundException(Long veterinarioId){
        super("ERR_DATA_NOT_FOUND","No se encontró el veterinario especificado",veterinarioId);
    }
    
}
