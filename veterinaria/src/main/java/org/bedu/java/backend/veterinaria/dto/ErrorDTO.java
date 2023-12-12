package org.bedu.java.backend.veterinaria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Data
public class ErrorDTO {
    private String code;
    private String message;
    private Object details;

}
