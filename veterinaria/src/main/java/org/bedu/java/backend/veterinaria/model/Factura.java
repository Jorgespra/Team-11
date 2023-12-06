package org.bedu.java.backend.veterinaria.model;

import java.util.LinkedList;
import java.util.List;

// import lombok.AllArgsConstructor;
// import lombok.Data;

// @Data
// @AllArgsConstructor

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
    
    @Column(nullable = false, length = 100)
    private String servicio;
    
    
    @Column(nullable = false, length = 100)
    private String detalle;
    
    @Range(min = 1, max = 1000)
    private int cantidad;
    
    // @JoinColumns({
	// 	@JoinColumn(name="MEDICAMENTO_ID",referencedColumnName="id")
	// })
    // @JoinColumn(name = Medicamento.id)
/* 
    public Factura(){
        this.medicamentos =  new LinkedList<Medicamento>();
    }
*/
    @DecimalMin("0.01")
    @DecimalMax("9999999.99")
    private double costo;

}
