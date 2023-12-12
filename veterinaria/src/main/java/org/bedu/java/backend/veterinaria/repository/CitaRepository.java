package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitaRepository extends CrudRepository<Cita, Long> {
    List<Cita> findAll();

}
