package br.com.teste.query;

import java.util.List;

import br.com.teste.model.usuario.HoraDoUsuario;

public interface RegistroDePontoQueryService {

	List<HoraDoUsuario> listar(Long id);

}