package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.Cita;
import org.bedu.java.backend.veterinaria.model.Interpretation;
import org.bedu.java.backend.veterinaria.model.InterpretationKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterpretationRepository extends JpaRepository<Interpretation, InterpretationKey> {
    @Query("SELECT i.cita FROM Interpretation i WHERE i.veterinario.id = :veterinarioId")
    List<Cita>  findCitaByVeterinario(long veterinarioId);

    @Query("SELECT i.cita FROM Interpretation i WHERE i.mascota.id = :mascotaId")
    List<Cita>  findCitaByMascota(long mascotaId);




}
