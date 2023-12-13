package org.bedu.java.backend.veterinaria;

import org.bedu.java.backend.veterinaria.dto.CreateMedicamentoDTO;
import org.bedu.java.backend.veterinaria.mapper.MedicamentoMapper;
import org.bedu.java.backend.veterinaria.model.Medicamento;
import org.bedu.java.backend.veterinaria.repository.MedicamentoRepository;
import org.bedu.java.backend.veterinaria.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class VeterinariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeterinariaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(
			MedicamentoService medicamentoService
	) {
		return args -> {

			try {
				CreateMedicamentoDTO data1 = new CreateMedicamentoDTO(
						"Antipulgas",
						"Antiparasitario",
						"Protege contra pulgas y garrapatas",
						new SimpleDateFormat("yyyy-MM-dd").parse("2023-11-25"),
						150, 12.99F,
						"Aplicar mensualmente en la espalda");

				CreateMedicamentoDTO data2 = new CreateMedicamentoDTO(
						"Suplemento Vitamínico",
						"Suplemento",
						"Ayuda al desarrollo y salud general",
						new SimpleDateFormat("yyyy-MM-dd").parse("2024-07-12"),
						100,
						7.50F,
						"Agregar a la comida diaria");

				CreateMedicamentoDTO data3 = new CreateMedicamentoDTO(
						"Antiinflamatorio para Mascotas",
						"Antiinflamatorio",
						"Reduce inflamaciones y molestias",
						new SimpleDateFormat("yyyy-MM-dd").parse("2023-12-30"),
						80,
						15.25F,
						"Administrar con el alimento");

				CreateMedicamentoDTO data4 = new CreateMedicamentoDTO(
						"Jarabe para Tos",
						"Expectorante",
						"Alivia la tos en mascotas",
						new SimpleDateFormat("yyyy-MM-dd").parse("2024-05-18"),
						50,
						9.75F,
						"Seguir indicaciones del veterinario");

				CreateMedicamentoDTO data5 = new CreateMedicamentoDTO(
						"Supresor de Apetito",
						"Control de Peso",
						"Ayuda en el control del peso",
						new SimpleDateFormat("yyyy-MM-dd").parse("2024-10-03"),
						120,
						18.50F,
						"Administrar según las indicaciones");

				medicamentoService.save(data1);
				medicamentoService.save(data2);
				medicamentoService.save(data3);
				medicamentoService.save(data4);
				medicamentoService.save(data5);

			} catch (Exception e) {
				e.printStackTrace();
			}



		};
	}

}
