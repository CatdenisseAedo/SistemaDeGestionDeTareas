package org.generation.sistemadegestiondetareas.services;

import org.generation.sistemadegestiondetareas.models.Usuario;
import org.generation.sistemadegestiondetareas.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicesimpl implements UsuarioServices {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listadeUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorId(Long id) {
        Boolean existe = usuarioRepository.existsById(id);
        if (existe) {
            Usuario usuarioEscogido = usuarioRepository.findById(id).get();
            return usuarioEscogido;
        } else {
            System.out.println("El id es invalido o no existe");
            return null;
        }
    }

    @Override
    public Usuario guardarUsuario(Usuario usuarioNuevo) {
        Usuario usuarioExiste = usuarioRepository.findByUsuarioNombre(usuarioNuevo.getNombreUsuario());
        if (usuarioExiste != null){
            System.out.println("El nombre de usuario ya esta en uso");
            return null;
        }else {
            return usuarioRepository.save(usuarioNuevo);
        }
    }

    @Override
    public Usuario editarUsuarioPorId(Long id, Usuario usuarioActualizado) {
        Boolean existe = usuarioRepository.existsById(id);
        if (existe) {
            Usuario usuarioSeleccionado = usuarioRepository.findById(id).get();
            usuarioSeleccionado.setNombreUsuario(usuarioActualizado.getNombreUsuario());
            usuarioSeleccionado.setEmailUsuario(usuarioSeleccionado.getEmailUsuario());
            System.out.println("El usuario a sido actualizado");
            return usuarioRepository.save(usuarioSeleccionado);
        } else {
            System.out.println("El id no es valido");
            return null;
        }
    }

    @Override
    public void borrarUsuario(Long id) {
        usuarioRepository.deleteById(id);

    }
}