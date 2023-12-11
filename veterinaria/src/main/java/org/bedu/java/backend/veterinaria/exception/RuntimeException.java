package org.bedu.java.backend.veterinaria.exception;

@Getter
@Setter
public class RuntimeException extends Exception{

    private String code;
    private Object details;

    public RuntimeException(String code, String message, Object details){
        super(message);
        this.code = code;
        this.details = details;
    }
    
}
