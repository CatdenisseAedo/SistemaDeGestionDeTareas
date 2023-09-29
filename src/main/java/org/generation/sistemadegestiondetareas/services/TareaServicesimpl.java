package org.generation.sistemadegestiondetareas.services;
import org.generation.sistemadegestiondetareas.models.Tarea;
import org.generation.sistemadegestiondetareas.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServicesimpl implements TareaServices {
    @Autowired
    TareaRepository tareaRepository;

    @Override
    public List<Tarea> listaDeTareas() {
        return tareaRepository.findAll();
    }

    @Override
    public Tarea buscarTareaPorId(Long id) {
        Boolean existe = tareaRepository.existsById(id);
        if (existe) {
            Tarea tareaEscogida = tareaRepository.findById(id).get();
            return tareaEscogida;
        } else {
            System.out.println("El id de la tarea es invalido");
            return null;
        }
    }
    @Override
    public Tarea guardarTarea(Tarea tareaNueva) {
        return tareaRepository.save(tareaNueva);
    }

    @Override
    public Tarea editarTareaPorId(Long id, Tarea tareaActualizada) {
        Boolean exite = tareaRepository.existsById(id);
        if (exite) {
            Tarea tareaSeleccionada = tareaRepository.findById(id).get();
            tareaSeleccionada.setTituloTarea(tareaActualizada.getTituloTarea());
            tareaSeleccionada.setDescripcionTarea(tareaActualizada.getDescripcionTarea());
            tareaSeleccionada.setFechaVencimiento(tareaActualizada.getFechaVencimiento());
            System.out.println("La tarea a sido actualizada");
            return tareaRepository.save(tareaSeleccionada);
        } else {
            System.out.println("El id de tarea no es valido");
            return null;
        }
    }

    @Override
    public void borrarTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}
