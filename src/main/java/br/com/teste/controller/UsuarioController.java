package br.com.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.model.usuario.Usuario;
import br.com.teste.security.repository.UsuarioRepository;

@RestController
public class UsuarioController {

	@Autowired
    private UsuarioRepository usuarioRepository;
	
	@GetMapping("/listarUsuarios")
    public List<Usuario> listarUsuarios() {
        
    	return usuarioRepository.findAll();
    }
	
	@PostMapping("/cadastrarUsuario")
    public void listarUsuarios(@RequestBody Usuario usuario) {
        
    	usuarioRepository.save(usuario);
    }

}
