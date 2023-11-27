package org.bedu.java.backend.veterinaria.controller;



import org.bedu.java.backend.veterinaria.dto.CitaDTO;
import org.bedu.java.backend.veterinaria.dto.CreateCitaDTO;
import org.bedu.java.backend.veterinaria.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class CitaController {

    @Autowired
    private CitaService citaService;

    @RequestMapping("/obtenerCitas")
    public List<CitaDTO> getAll(){
        return citaService.getAll();
    }

    @RequestMapping ("/crearCita")
    public CitaDTO save (@RequestBody CreateCitaDTO data) {
        return citaService.save(data);

    }


}
