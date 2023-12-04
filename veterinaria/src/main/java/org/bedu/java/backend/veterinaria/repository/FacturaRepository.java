package org.bedu.java.backend.veterinaria.repository;

import java.util.List;

import org.bedu.java.backend.veterinaria.model.Factura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// import java.util.LinkedList;
// import java.util.Optional;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Long> {

    List<Factura> findAll();
}