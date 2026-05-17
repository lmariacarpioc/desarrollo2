package service;

import model.Usuario;
import repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // LISTAR TODOS
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    // BUSCAR POR ID
    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    // GUARDAR
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // ELIMINAR
    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }
}