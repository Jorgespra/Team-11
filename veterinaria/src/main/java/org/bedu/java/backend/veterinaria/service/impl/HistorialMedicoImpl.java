package org.bedu.java.backend.veterinaria.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.bedu.java.backend.veterinaria.dto.HistorialMedicoDto;
import org.bedu.java.backend.veterinaria.exception.ResourceNotFoundException;
import org.bedu.java.backend.veterinaria.mapper.AutoHistorialMedicoMapper;
import org.bedu.java.backend.veterinaria.model.HistorialMedico;
import org.bedu.java.backend.veterinaria.model.Mascota;
import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.bedu.java.backend.veterinaria.repository.HistorialMedicoRepository;
import org.bedu.java.backend.veterinaria.repository.MascotaRepository;
import org.bedu.java.backend.veterinaria.repository.VeterinarioRepository;
import org.bedu.java.backend.veterinaria.service.HistorialMedicoService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HistorialMedicoImpl implements HistorialMedicoService {
    private HistorialMedicoRepository historialMedicoRepository;
    private VeterinarioRepository veterinarioRepository;
    private MascotaRepository mascotaRepository;

    /* 
    @Override
    public HistorialMedicoDto createHistorialMedico(HistorialMedicoDto historialMedicoDto) {
        HistorialMedico historialMedico = AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedico(historialMedicoDto);

        // Obtener el Veterinario de la base de datos o guardarlo si es nuevo
        Veterinario doctor = historialMedico.getDoctor();
        if (doctor != null && doctor.getId() != null) {
            doctor = veterinarioRepository.findById(doctor.getId())
                    .orElseThrow(() -> new ResourceNotFoundException("Veterinario", "id", historialMedico.getDoctor().getId()));
        } else {
            doctor = veterinarioRepository.save(doctor);
        }

        // Obtener la Mascota de la base de datos o guardarla si es nueva
        Mascota mascota = historialMedico.getMascota();
        if (mascota != null && mascota.getId() != null) {
            mascota = mascotaRepository.findById(mascota.getId())
                    .orElseThrow(() -> new ResourceNotFoundException("Mascota", "id", historialMedico.getMascota().getId()));
        } else {
            mascota = mascotaRepository.save(mascota);
        }

        // Asignar el Veterinario y la Mascota al HistorialMedico
        historialMedico.setDoctor(doctor);
        historialMedico.setMascota(mascota);

        HistorialMedico savedHistorialMedico = historialMedicoRepository.save(historialMedico);

        return AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(savedHistorialMedico);
    }
    */

    @Override
    public HistorialMedicoDto createHistorialMedico(HistorialMedicoDto historialMedicoDto) {
    HistorialMedico historialMedico = AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedico(historialMedicoDto);

    // Guardar el Veterinario
    Veterinario doctor = historialMedico.getDoctor();
    doctor = veterinarioRepository.save(doctor);

    // Guardar la Mascota
    Mascota mascota = historialMedico.getMascota();
    mascota = mascotaRepository.save(mascota);

    // Asignar el Veterinario y la Mascota al HistorialMedico
    historialMedico.setDoctor(doctor);
    historialMedico.setMascota(mascota);

    HistorialMedico savedHistorialMedico = historialMedicoRepository.save(historialMedico);

    return AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(savedHistorialMedico);
    }
    
    
    @Override
    public List<HistorialMedicoDto> getAllHistorialMedico() {
        List<HistorialMedico> historialesMedico = historialMedicoRepository.findAll();

        return historialesMedico.stream().map((historialMedico) -> AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(historialMedico))
        .collect(Collectors.toList());
    }
    /* 
    @Override
    public HistorialMedicoDto updateHistorialMedico(HistorialMedicoDto historialMedico) {

        HistorialMedico existingHistorialMedico = historialMedicoRepository.findById(historialMedico.getId()).orElseThrow(
            () -> new ResourceNotFoundException("HistorialMedico", "id", historialMedico.getId())
        );

        existingHistorialMedico.setDoctor(historialMedico.getDoctor());
        existingHistorialMedico.setMascota(historialMedico.getMascota());
        existingHistorialMedico.setFechaConsulta(historialMedico.getFechaConsulta());
        existingHistorialMedico.setDiagnostico(historialMedico.getDiagnostico());
        existingHistorialMedico.setTratamientoActual(historialMedico.getTratamientoActual());
        existingHistorialMedico.setMedicamentosRecetados(historialMedico.getMedicamentosRecetados());
        existingHistorialMedico.setResultadoPruebas(historialMedico.getResultadoPruebas());
        existingHistorialMedico.setObservaciones(historialMedico.getObservaciones());

        HistorialMedico updateHistorialMedico = historialMedicoRepository.save(existingHistorialMedico);

        return AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(updateHistorialMedico);

    }*/
    @Override
    public HistorialMedicoDto updateHistorialMedico(HistorialMedicoDto historialMedico) {
    try {
        HistorialMedico existingHistorialMedico = historialMedicoRepository.findById(historialMedico.getId())
                .orElseThrow(() -> new ResourceNotFoundException("HistorialMedico", "id", historialMedico.getId()));

        existingHistorialMedico.setDoctor(historialMedico.getDoctor());
        existingHistorialMedico.setMascota(historialMedico.getMascota());
        existingHistorialMedico.setFechaConsulta(historialMedico.getFechaConsulta());
        existingHistorialMedico.setDiagnostico(historialMedico.getDiagnostico());
        existingHistorialMedico.setTratamientoActual(historialMedico.getTratamientoActual());
        existingHistorialMedico.setMedicamentosRecetados(historialMedico.getMedicamentosRecetados());
        existingHistorialMedico.setResultadoPruebas(historialMedico.getResultadoPruebas());
        existingHistorialMedico.setObservaciones(historialMedico.getObservaciones());

        HistorialMedico updateHistorialMedico = historialMedicoRepository.save(existingHistorialMedico);

        return AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(updateHistorialMedico);
    } catch (ResourceNotFoundException ex) {
        // Manejar la excepción aquí
        ex.printStackTrace(); // Imprime el seguimiento de la pila en la consola
        // También puedes lanzar otra excepción, si es necesario
        throw new RuntimeException("Error al actualizar HistorialMedico", ex);
    }
}

    @Override
    public HistorialMedicoDto getHistorialMedicoById(Long historialMedicoId) {
    try {
        HistorialMedico historialMedico = historialMedicoRepository.findById(historialMedicoId)
                .orElseThrow(() -> new ResourceNotFoundException("HistorialMedico", "id", historialMedicoId));

        return AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(historialMedico);
    } catch (ResourceNotFoundException ex) {
        // Manejar la excepción aquí
        ex.printStackTrace();
        // También puedes lanzar otra excepción, si es necesario
        throw new RuntimeException("HistorialMedico no encontrado", ex);
        }
    }

    /*
    @Override
    public HistorialMedicoDto getHistorialMedicoById(Long historialMedicoId) {
         HistorialMedico historialMedico = historialMedicoRepository.findById(historialMedicoId).orElseThrow(
                () -> new ResourceNotFoundException("User", "id", historialMedicoId)
        );
        return AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(historialMedico);
    }
    */

    @Override
    public void deleteHistorialMedico(Long historialMedicoId) {
        historialMedicoRepository.deleteById(historialMedicoId);
    }
    
    @Override
    public List<HistorialMedicoDto> getHistorialesByMascotaId(Long mascotaId) {
        List<HistorialMedico> historiales = historialMedicoRepository.findByMascotaId(mascotaId);
        return historiales.stream()
                .map(AutoHistorialMedicoMapper.MAPPER::mapToHistorialMedicoDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<HistorialMedicoDto> getHistorialesByVeterinarioId(Long veterinarioId) {
        List<HistorialMedico> historiales = historialMedicoRepository.findByDoctorId(veterinarioId);
        return historiales.stream()
                .map(AutoHistorialMedicoMapper.MAPPER::mapToHistorialMedicoDto)
                .collect(Collectors.toList());
    }
}
