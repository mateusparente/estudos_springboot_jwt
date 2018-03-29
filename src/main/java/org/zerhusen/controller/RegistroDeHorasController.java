package org.zerhusen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zerhusen.command.RegistroDePontoCommandService;
import org.zerhusen.model.usuario.HoraDoUsuario;
import org.zerhusen.model.usuario.Ponto;
import org.zerhusen.query.RegistroDePontoQueryService;

@RestController
public class RegistroDeHorasController {

	@Autowired
	private RegistroDePontoCommandService commandService;
	
	@Autowired
	private RegistroDePontoQueryService queryService;
	
	@GetMapping("/buscarPontos/{id}")
    public List<HoraDoUsuario> buscarPontos(@PathVariable("id") Long id) {
		return queryService.listar(id);
    }
	
	@PostMapping("/registrarPonto")
    public void registrarPonto(@RequestBody Ponto ponto) {
		commandService.registrar(ponto);
    }
	
}
