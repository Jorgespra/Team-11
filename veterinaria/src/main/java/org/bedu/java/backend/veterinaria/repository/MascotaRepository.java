package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends JpaRepository<Mascota, Long>{
    
}
