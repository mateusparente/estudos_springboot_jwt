package br.com.teste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.teste.model.usuario.HoraDoUsuario;
import br.com.teste.model.usuario.Usuario;

public interface RegistroDePontosRepository extends JpaRepository<HoraDoUsuario, Long>{

	List<HoraDoUsuario> findAllByUsuario(Usuario usuario);
	
}