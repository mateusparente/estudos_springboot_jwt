package org.zerhusen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerhusen.model.usuario.HoraDoUsuario;
import org.zerhusen.model.usuario.Usuario;

public interface RegistroDePontosRepository extends JpaRepository<HoraDoUsuario, Long>{

	List<HoraDoUsuario> findAllByUsuario(Usuario usuario);
	
}