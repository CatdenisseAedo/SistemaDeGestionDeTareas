package org.generation.sistemadegestiondetareas.services;

import org.generation.sistemadegestiondetareas.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UsuarioServices {
    List<Usuario> listadeUsuarios();

    Usuario buscarUsuarioPorId (Long id);


    Usuario guardarUsuario(Usuario usuarioNuevo);

    Usuario editarUsuarioPorId (Long id, Usuario usuarioActualizado);

    void borrarUsuario (Long id);
}