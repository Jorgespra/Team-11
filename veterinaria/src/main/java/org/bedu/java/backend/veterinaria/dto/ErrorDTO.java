package org.bedu.java.backend.veterinaria.dto;

@Data
@AllArgsConstructor
public class ErrorDTO {
    private String code;
    private String message;
    private Object details;
}
