package org.bedu.java.backend.veterinaria.repository;

import java.util.List;
import org.bedu.java.backend.veterinaria.model.FacturaMedicamento;
import org.bedu.java.backend.veterinaria.model.FacturaMedicamentoKey;
import org.bedu.java.backend.veterinaria.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaMedicamentoRepository extends JpaRepository<FacturaMedicamento, FacturaMedicamentoKey> {

    @Query("SELECT i.medicamento FROM FacturaMedicamento i WHERE i.factura.id = :facturaId")
    List<Medicamento> findMedicamentoByFactura(@Param("facturaId") long facturaId);

}
