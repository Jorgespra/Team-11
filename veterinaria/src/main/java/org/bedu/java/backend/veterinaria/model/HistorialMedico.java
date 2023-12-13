package org.bedu.java.backend.veterinaria.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "historial")
public class HistorialMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "veterinario_id", referencedColumnName = "id")
    private Veterinario veterinario;

    @ManyToOne
    @JoinColumn(name = "mascota_id", referencedColumnName = "id")
    private Mascota mascota;

    @Column(nullable = false)
    private LocalDate fechaConsulta;
    
    @Column(nullable = false)
    private String diagnostico;

    @Column(nullable = false)
    private String tratamientoActual;

    @Column(nullable = true)
    private String medicamentosRecetados;

    @Column(nullable = true)
    private String resultadoPruebas;
    
    @Column(nullable = true)
    private String observaciones;

}
