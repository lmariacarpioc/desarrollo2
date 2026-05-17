package controller;

import model.Usuario;
import service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // LISTAR
    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listar();
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Optional<Usuario> buscar(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }

    // CREAR
    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioService.guardar(usuario);
    }

    // ELIMINAR
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        usuarioService.eliminar(id);
    }
}