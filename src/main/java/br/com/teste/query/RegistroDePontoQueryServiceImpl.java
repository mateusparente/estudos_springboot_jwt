package br.com.teste.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.model.usuario.HoraDoUsuario;
import br.com.teste.model.usuario.Usuario;
import br.com.teste.repository.RegistroDePontosRepository;

@Service
public class RegistroDePontoQueryServiceImpl implements RegistroDePontoQueryService {

	@Autowired private RegistroDePontosRepository repository;
	
	@Override
	public List<HoraDoUsuario> listar(Long id) {
		
		return repository.findAllByUsuario(new Usuario(id));
	}
	
}
