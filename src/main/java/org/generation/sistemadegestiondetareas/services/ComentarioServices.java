package org.generation.sistemadegestiondetareas.services;

import org.generation.sistemadegestiondetareas.models.Comentario;

import java.util.List;

public interface ComentarioServices {
    List<Comentario> listaDeComentarios();

    Comentario buscarComentarioPorId (Long id);

    Comentario guardarComentario(Comentario comentarioNuevo);

    Comentario editarComentarioPorId (Long id, Comentario comentarioActualizado);
    void borrarComentario(long id);
}