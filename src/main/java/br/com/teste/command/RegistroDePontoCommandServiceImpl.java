package br.com.teste.command;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.model.usuario.HoraDoUsuario;
import br.com.teste.model.usuario.Ponto;
import br.com.teste.model.usuario.Usuario;
import br.com.teste.repository.RegistroDePontosRepository;

@Service
public class RegistroDePontoCommandServiceImpl implements RegistroDePontoCommandService {

	@Autowired private RegistroDePontosRepository repository;
	
	@Override
	public void registrar(Ponto ponto) {
		
		HoraDoUsuario horaDoUsuario = new HoraDoUsuario();
		
		horaDoUsuario.setUsuario(new Usuario(ponto.getUsuario()));
		horaDoUsuario.setDia(new Date());
		horaDoUsuario.setHorasTrabalhadas(ponto.getHoras());
		
		repository.save(horaDoUsuario);
		
	}
	
}
