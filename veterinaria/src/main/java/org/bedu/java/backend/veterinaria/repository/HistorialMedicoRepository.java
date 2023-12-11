package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.HistorialMedico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistorialMedicoRepository extends JpaRepository<HistorialMedico, Long> {

    List<HistorialMedico> findByDoctorId(Long doctorId);
    List<HistorialMedico> findByMascotaId(Long mascotaId);
}
