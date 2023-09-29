package org.generation.sistemadegestiondetareas.repositories;

import org.generation.sistemadegestiondetareas.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea,Long> {
}