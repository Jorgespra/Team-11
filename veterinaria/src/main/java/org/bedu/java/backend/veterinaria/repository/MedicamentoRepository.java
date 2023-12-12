package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.Medicamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MedicamentoRepository extends CrudRepository<Medicamento, Long> {
    List<Medicamento> findAll();
}
