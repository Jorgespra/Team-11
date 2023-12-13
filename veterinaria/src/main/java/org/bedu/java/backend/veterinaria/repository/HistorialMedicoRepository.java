package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.HistorialMedico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistorialMedicoRepository extends JpaRepository<HistorialMedico, Long> {

    List<HistorialMedico> findByVeterinarioId(Long veterinarioId);
    List<HistorialMedico> findByMascotaId(Long mascotaId);
}
