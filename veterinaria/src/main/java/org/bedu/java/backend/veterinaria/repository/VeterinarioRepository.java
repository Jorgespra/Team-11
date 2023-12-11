package org.bedu.java.backend.veterinaria.repository;

import java.util.List;

import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinarioRepository extends CrudRepository<Veterinario,Long> {

    List<Veterinario> findAll();
    
}

/* package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
    
}
 */