package org.bedu.java.backend.veterinaria.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.bedu.java.backend.veterinaria.dto.HistorialMedicoDto;
import org.bedu.java.backend.veterinaria.exception.ResourceNotFoundException;
import org.bedu.java.backend.veterinaria.mapper.AutoHistorialMedicoMapper;
import org.bedu.java.backend.veterinaria.model.HistorialMedico;
import org.bedu.java.backend.veterinaria.repository.HistorialMedicoRepository;
import org.bedu.java.backend.veterinaria.service.HistorialMedicoService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HistorialMedicoImpl implements HistorialMedicoService {
    private HistorialMedicoRepository historialMedicoRepository;
    
    
    @Override
    public HistorialMedicoDto createHistorialMedico(HistorialMedicoDto historialMedicoDto) {
        HistorialMedico historialMedico = AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedico(historialMedicoDto);
        
        HistorialMedico savedHistorialMedico = historialMedicoRepository.save(historialMedico);

        HistorialMedicoDto savedHistorialMedicoDto = AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(savedHistorialMedico);
       
        return savedHistorialMedicoDto;
    }

    @Override
    public HistorialMedicoDto getHistorialMedicoById(Long historialMedicoId) {
         HistorialMedico historialMedico = historialMedicoRepository.findById(historialMedicoId).orElseThrow(
                () -> new ResourceNotFoundException("User", "id", historialMedicoId)
        );
        return AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(historialMedico);
    }

    @Override
    public List<HistorialMedicoDto> getAllHistorialMedico() {
        List<HistorialMedico> historialesMedico = historialMedicoRepository.findAll();

        return historialesMedico.stream().map((historialMedico) -> AutoHistorialMedicoMapper.MAPPER.mapToHistorialMedicoDto(historialMedico))
        .collect(Collectors.toList());
    }

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

    }

    @Override
    public void deleteHistorialMedico(Long historialMedicoId) {
        historialMedicoRepository.deleteById(historialMedicoId);
    }

    /*private List<HistorialMedico> historiales = new ArrayList<>();

    // Obtener todos los historiales médicos
    public List<HistorialMedico> obtenerTodosHistoriales() {
        return historiales;
    }

    // Obtener un historial médico por ID
    public HistorialMedico obtenerHistorialPorId(long id) {
        Optional<HistorialMedico> historialEncontrado = historiales.stream()
                .filter(h -> h.getId() == id)
                .findFirst();
        return historialEncontrado.orElse(null);
    }

    // Crear un nuevo historial médico
    public HistorialMedico crearHistorial(HistorialMedico historial) {
        historial.setId(generarNuevoId());
        historiales.add(historial);
        return historial;
    }

    // Actualizar un historial médico existente
    public HistorialMedico actualizarHistorial(long id, HistorialMedico historialActualizado) {
        for (int i = 0; i < historiales.size(); i++) {
            if (historiales.get(i).getId() == id) {
                historiales.set(i, historialActualizado);
                return historialActualizado;
            }
        }
        return null;
    }

    // Eliminar un historial médico por ID
    public boolean eliminarHistorial(long id) {
        return historiales.removeIf(h -> h.getId() == id);
    }

    // Método auxiliar para generar un nuevo ID (puedes ajustarlo según tus necesidades)
    private long generarNuevoId() {
        return System.currentTimeMillis(); // En este ejemplo, usamos la marca de tiempo actual como ID
    }
    */


}
