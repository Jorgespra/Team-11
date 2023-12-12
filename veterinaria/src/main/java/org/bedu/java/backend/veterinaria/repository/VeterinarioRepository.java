package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
}
