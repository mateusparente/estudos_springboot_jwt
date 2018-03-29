package org.zerhusen.command;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerhusen.model.usuario.HoraDoUsuario;
import org.zerhusen.model.usuario.Ponto;
import org.zerhusen.model.usuario.Usuario;
import org.zerhusen.repository.RegistroDePontosRepository;

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
