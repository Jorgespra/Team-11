package org.bedu.java.backend.veterinaria.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "facturas_medicamentos")
public class FacturaMedicamento {
    @EmbeddedId
    private FacturaMedicamentoKey id;


    @ManyToOne
    @MapsId("facturaId")
    @JoinColumn(name = "factura_id")
    private Factura factura;

    @ManyToOne
    @MapsId("medicamentoId")
    @JoinColumn(name = "medicamento_id")
    private Medicamento medicamento;

}
