package org.bedu.java.backend.veterinaria.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.bedu.java.backend.veterinaria.dto.HistorialMedicoDto;
import org.bedu.java.backend.veterinaria.exception.HistorialMedicoNotFoundException;
import org.bedu.java.backend.veterinaria.mapper.HistorialMedicoMapper;
import org.bedu.java.backend.veterinaria.model.HistorialMedico;
import org.bedu.java.backend.veterinaria.model.Mascota;
import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.bedu.java.backend.veterinaria.repository.HistorialMedicoRepository;
import org.bedu.java.backend.veterinaria.repository.MascotaRepository;
import org.bedu.java.backend.veterinaria.repository.VeterinarioRepository;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HistorialMedicoImpl implements HistorialMedicoService {
    private HistorialMedicoRepository historialMedicoRepository;
    private VeterinarioRepository veterinarioRepository;
    private MascotaRepository mascotaRepository;
    @Override
    @Transactional
    public HistorialMedicoDto createHistorialMedico(HistorialMedicoDto historialMedicoDto) throws HistorialMedicoNotFoundException {
    HistorialMedico historialMedico = HistorialMedicoMapper.MAPPER.mapToHistorialMedico(historialMedicoDto);

    // Obtener o guardar el Veterinario
    Veterinario doctor = saveOrUpdateVeterinario(historialMedico.getDoctor());

    // Obtener o guardar la Mascota
    Mascota mascota = saveOrUpdateMascota(historialMedico.getMascota());

    // Asignar el Veterinario y la Mascota al HistorialMedico
    historialMedico.setDoctor(doctor);
    historialMedico.setMascota(mascota);

    HistorialMedico savedHistorialMedico = historialMedicoRepository.save(historialMedico);

    return HistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(savedHistorialMedico);
}

    private Veterinario saveOrUpdateVeterinario(Veterinario doctor) throws HistorialMedicoNotFoundException {
    if (doctor != null && doctor.getId() != 0) {
        return veterinarioRepository.findById(doctor.getId())
                .orElseThrow(() -> new HistorialMedicoNotFoundException(doctor.getId()));
    } else {
        return veterinarioRepository.save(doctor);
    }
    }

    private Mascota saveOrUpdateMascota(Mascota mascota) throws HistorialMedicoNotFoundException {
    if (mascota != null && mascota.getId() != 0) {
        return mascotaRepository.findById(mascota.getId())
                .orElseThrow(() -> new HistorialMedicoNotFoundException(mascota.getId()));
    } else {
        return mascotaRepository.save(mascota);
    }
    }

    @Override
    public List<HistorialMedicoDto> getAllHistorialMedico() {
        List<HistorialMedico> historialesMedico = historialMedicoRepository.findAll();

        return historialesMedico.stream().map((historialMedico) -> HistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(historialMedico))
        .collect(Collectors.toList());
    }

    @Override
    public HistorialMedicoDto updateHistorialMedico(HistorialMedicoDto historialMedicoDto) throws HistorialMedicoNotFoundException {
    // Buscar el historial existente por ID
    Optional<HistorialMedico> optionalExistingHistorialMedico = historialMedicoRepository.findById(historialMedicoDto.getId());

    if (optionalExistingHistorialMedico.isPresent()) {
        HistorialMedico existingHistorialMedico = optionalExistingHistorialMedico.get();

        // Actualizar los campos del historial existente con los nuevos datos
        existingHistorialMedico.setDoctor(historialMedicoDto.getDoctor());
        existingHistorialMedico.setMascota(historialMedicoDto.getMascota());
        existingHistorialMedico.setFechaConsulta(historialMedicoDto.getFechaConsulta());
        existingHistorialMedico.setDiagnostico(historialMedicoDto.getDiagnostico());
        existingHistorialMedico.setTratamientoActual(historialMedicoDto.getTratamientoActual());
        existingHistorialMedico.setMedicamentosRecetados(historialMedicoDto.getMedicamentosRecetados());
        existingHistorialMedico.setResultadoPruebas(historialMedicoDto.getResultadoPruebas());
        existingHistorialMedico.setObservaciones(historialMedicoDto.getObservaciones());

        // Guardar el historial actualizado en la base de datos
        HistorialMedico updatedHistorialMedico = historialMedicoRepository.save(existingHistorialMedico);

        return HistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(updatedHistorialMedico);
    } else {
        throw new HistorialMedicoNotFoundException(historialMedicoDto.getId());
    }
}

    @Override
    public HistorialMedicoDto getHistorialMedicoById(Long historialMedicoId) throws HistorialMedicoNotFoundException {
    // Buscar el historial por ID
    Optional<HistorialMedico> optionalHistorialMedico = historialMedicoRepository.findById(historialMedicoId);

    if (optionalHistorialMedico.isPresent()) {
        // Si se encuentra, mapear a DTO y devolverlo
        HistorialMedico historialMedico = optionalHistorialMedico.get();
        return HistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(historialMedico);
    } else {
        // Si no se encuentra, lanzar excepción de recurso no encontrado
        throw new HistorialMedicoNotFoundException(historialMedicoId);
    }
}


    @Override
    public void deleteHistorialMedico(Long historialMedicoId) {
        historialMedicoRepository.deleteById(historialMedicoId);
    }

    @Override
    public List<HistorialMedicoDto> getHistorialesByMascotaId(Long mascotaId) {
        List<HistorialMedico> historiales = historialMedicoRepository.findByMascotaId(mascotaId);
        return historiales.stream()
                .map(HistorialMedicoMapper.MAPPER::mapToHistorialMedicoDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<HistorialMedicoDto> getHistorialesByVeterinarioId(Long veterinarioId) {
        List<HistorialMedico> historiales = historialMedicoRepository.findByDoctorId(veterinarioId);
        return historiales.stream()
                .map(HistorialMedicoMapper.MAPPER::mapToHistorialMedicoDto)
                .collect(Collectors.toList());
    }
}
