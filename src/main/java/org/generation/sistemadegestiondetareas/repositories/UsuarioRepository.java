package org.generation.sistemadegestiondetareas.repositories;

import org.generation.sistemadegestiondetareas.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Usuario findByUsuarioNombre(String usuarioNombre);
}