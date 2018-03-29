package br.com.teste.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.teste.model.usuario.Usuario;

/**
 * Created by stephan on 20.03.16.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
