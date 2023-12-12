package org.bedu.java.backend.veterinaria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class InterpretationKey {

    @Column(name = "cita_id")
    private long citaId;

    @Column(name = "veterinario_id")
    private long veterinarioId;

    @Column (name = "mascota_id")
    private long mascotaId;

}
