package org.bedu.citas.controller;


import org.bedu.citas.Service.CitaService;
import org.bedu.citas.dto.CitaDTO;
import org.bedu.citas.dto.CreateCitaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentsController {

    @Autowired
    private CitaService citaService;

    @RequestMapping("/citas")
    public List<CitaDTO> getAll(){
        return citaService.getAll();
    }

    @RequestMapping ("/crearCita")
    public CitaDTO save (@RequestBody CreateCitaDTO data) {
        return citaService.save(data);

    }


}
