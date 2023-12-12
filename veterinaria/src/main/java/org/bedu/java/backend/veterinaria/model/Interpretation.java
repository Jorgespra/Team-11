package org.bedu.java.backend.veterinaria.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="Interpretacion")
public class Interpretation  {

    @EmbeddedId
    private InterpretationKey id;

    @ManyToOne
    @MapsId ("citaId")
    @JoinColumn(name = "cita_id")
    private Cita cita;

    @ManyToOne
    @MapsId("veterinarioId")
    @JoinColumn(name = "veterinario_id")
    private Veterinario veterinario;

    @ManyToOne
    @MapsId("mascotaId")
    @JoinColumn(name = "mascota_id")
    private Mascota mascota;







}
