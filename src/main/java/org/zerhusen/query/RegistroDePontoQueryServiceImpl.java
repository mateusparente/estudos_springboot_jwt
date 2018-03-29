package org.zerhusen.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerhusen.model.usuario.HoraDoUsuario;
import org.zerhusen.model.usuario.Usuario;
import org.zerhusen.repository.RegistroDePontosRepository;

@Service
public class RegistroDePontoQueryServiceImpl implements RegistroDePontoQueryService {

	@Autowired private RegistroDePontosRepository repository;
	
	@Override
	public List<HoraDoUsuario> listar(Long id) {
		
		return repository.findAllByUsuario(new Usuario(id));
	}
	
}
