package org.bedu.java.backend.veterinaria.controller;

import java.util.List;

import org.bedu.java.backend.veterinaria.dto.CreateMascotaDTO;
import org.bedu.java.backend.veterinaria.dto.MascotaDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateMascotaDTO;
import org.bedu.java.backend.veterinaria.exception.MascotaNotFoundException;
import org.bedu.java.backend.veterinaria.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@Tag(name = "Endpoints de mascotas", description = "CRUD de mascotas")
@RestController
@RequestMapping("/mascotas")
public class MascotaController {
    
    @Autowired
    private MascotaService service;

    @Operation(summary = "Obtiene la lista de las mascotas")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MascotaDTO> findAll() {
        return service.findAll();
    }

    @Operation(summary = "Crea una nueva mascota")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MascotaDTO save(@Valid @RequestBody CreateMascotaDTO data) {
        return service.save(data);
    }

    @Operation(summary = "Actualiza la información de una mascota")
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable Long id, @Valid @RequestBody UpdateMascotaDTO updatedData) throws MascotaNotFoundException {
        service.update(id, updatedData);
    }

    @Operation(summary = "Elimina una mascota de la base de datos")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}
