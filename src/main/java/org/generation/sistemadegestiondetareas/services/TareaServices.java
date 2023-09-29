package org.generation.sistemadegestiondetareas.services;
import org.generation.sistemadegestiondetareas.models.Tarea;
import java.util.List;

public interface TareaServices {
    List<Tarea> listaDeTareas();

    Tarea buscarTareaPorId (Long id);

    Tarea guardarTarea(Tarea tareaNueva);

    Tarea editarTareaPorId (Long id, Tarea tareaActualizada);

    void borrarTarea (Long id);
}
