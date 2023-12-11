package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Repository
public interface CitaRepository extends CrudRepository<Cita, Long> {
    List<Cita> findAll();

}
