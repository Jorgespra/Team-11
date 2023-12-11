package org.bedu.java.backend.veterinaria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class FacturaMedicamentoKey {
    @Column(name = "factura_id")
    private long facturaId;

    @Column(name = "medicamento_id")
    private long medicamentoId;
}
