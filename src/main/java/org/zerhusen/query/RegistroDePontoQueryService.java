package org.zerhusen.query;

import java.util.List;

import org.zerhusen.model.usuario.HoraDoUsuario;

public interface RegistroDePontoQueryService {

	List<HoraDoUsuario> listar(Long id);

}