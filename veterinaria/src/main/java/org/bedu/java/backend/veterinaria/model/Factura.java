package org.bedu.java.backend.veterinaria.model;


// import lombok.AllArgsConstructor;
// import lombok.Data;

// @Data
// @AllArgsConstructor


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.JoinColumns;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @DecimalMin("0.01")
    private double sub_total;

    @DecimalMin("0.01")
    @DecimalMax("100.00") // TODO: ¿Por qué un limite para el IVA?
    private double iva;

    @DecimalMin("0.01")
    private double total;
    // @JoinColumns({
    // @JoinColumn(name="MEDICAMENTO_ID",referencedColumnName="id")
    // })
    // @JoinColumn(name = Medicamento.id)
    /*
     * public Factura(){
     * this.medicamentos = new LinkedList<Medicamento>();
     * }
     */

    @Column(nullable = false, length = 100)
    private String rfc_cliente;

    @Column(nullable = false, length = 100)
    private String razon_social;

}
