package org.bedu.java.backend.veterinaria.controller;

import jakarta.validation.Valid;
import org.bedu.java.backend.veterinaria.dto.CreateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.dto.MedicamentoDTO;
import org.bedu.java.backend.veterinaria.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @RequestMapping("/obtenerMedicamentos")
    public List<MedicamentoDTO> getAll() {
        return medicamentoService.getAll();
    }

    @RequestMapping("/crearMedicamento")
    public MedicamentoDTO save(@Valid @RequestBody CreateMedicamentoDTO data) {
        return medicamentoService.save(data);
    }

}
