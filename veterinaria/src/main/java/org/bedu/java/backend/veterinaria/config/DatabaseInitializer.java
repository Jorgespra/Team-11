package org.bedu.java.backend.veterinaria.config;

import org.bedu.java.backend.veterinaria.dto.CreateMascotaDTO;
import org.bedu.java.backend.veterinaria.dto.MascotaDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateMascotaDTO;
import org.bedu.java.backend.veterinaria.mapper.MascotaMapper;
import org.bedu.java.backend.veterinaria.service.MascotaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
 
@Component
public class DatabaseInitializer implements CommandLineRunner {
    private final MascotaService mascotaService;

    public DatabaseInitializer(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @Override
    public void run(String... args) throws Exception {

        for (int i = 1; i <= 10; i++) {
            CreateMascotaDTO mascotaDTO = new CreateMascotaDTO();
            mascotaDTO.setNombre("Mascota " + i);
            mascotaDTO.setEspecie("Especie " + i);
            mascotaDTO.setRaza("Raza " + i);
            mascotaDTO.setEdad(i);
            mascotaDTO.setAltura(0.5f);
            mascotaDTO.setPeso(10.0f);
            mascotaDTO.setSexo("Sexo " + i);
            mascotaDTO.setColor("Color " + i);
            mascotaService.save(mascotaDTO);
        }
        
        System.out.println("************************************************************");
        System.out.println("Registros generados:");
        List<MascotaDTO> mascotas = mascotaService.findAll();
        mascotas.forEach(mascota -> System.out.println("ID: " + mascota.getId() + ", Nombre: " + mascota.getNombre()));

        if (!mascotas.isEmpty()) {
        MascotaDTO primeraMascotaDTO = mascotas.get(0);
        UpdateMascotaDTO updateMascotaDTO = MascotaMapper.INSTANCE.toUpdateDTO(primeraMascotaDTO);
        updateMascotaDTO.setNombre("NuevoNombre");
        mascotaService.update(primeraMascotaDTO.getId(), updateMascotaDTO);
        System.out.println("************************************************************");
        System.out.println("Mascota actualizada: " + primeraMascotaDTO.getId() + ", Nuevo nombre: " + updateMascotaDTO.getNombre());
        }

        mascotas.stream()
                .filter(mascota -> mascota.getId() % 2 == 0)
                .forEach(mascota -> {
                    mascotaService.deleteById(mascota.getId());
                    System.out.println("Mascota eliminada: " + mascota.getId());
                });

        System.out.println("************************************************************");
        System.out.println("Operaciones completadas.");
        System.out.println("************************************************************");
    }
}
