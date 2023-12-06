package org.bedu.java.backend.veterinaria.repository;

import org.bedu.java.backend.veterinaria.model.FacturaMedicamento;
import org.bedu.java.backend.veterinaria.model.FacturaMedicamentoKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaMedicamentoRepository extends JpaRepository<FacturaMedicamento, FacturaMedicamentoKey>{
}
