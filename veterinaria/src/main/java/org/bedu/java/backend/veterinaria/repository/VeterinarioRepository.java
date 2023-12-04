package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeterinarioRepository extends CrudRepository<Veterinario, Long> {
    List<Veterinario> findAll();
}
