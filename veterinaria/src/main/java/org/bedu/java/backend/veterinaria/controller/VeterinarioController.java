package org.bedu.java.backend.veterinaria.controller;

import java.util.List;

import org.bedu.java.backend.veterinaria.model.VeterinarioModel;
import org.bedu.java.backend.veterinaria.service.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VeterinarioController {
    
    @Autowired
    private VeterinarioService veterinarioService;

    @RequestMapping("/getVeterinarios")
    public List<VeterinarioModel> getAllVeterinarios(){
        return veterinarioService.getAllVeterinarios();
    }

    @RequestMapping("/createVeterinario")
    public VeterinarioModel save(@RequestBody VeterinarioModel model){
        return veterinarioService.save(model);
    }






}
