package org.generation.sistemadegestiondetareas.repositories;

import org.generation.sistemadegestiondetareas.models.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
    @Repository
    public interface ComentarioRepository extends JpaRepository<Comentario,Long> {
    }

