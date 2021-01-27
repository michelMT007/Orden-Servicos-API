package com.michel.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.michel.osworks.domain.model.OrdemServico;
import com.michel.osworks.domain.repository.ClienteRepository;
import com.michel.osworks.domain.repository.OrdemServicoRepository;
import com.michel.osworks.domain.service.GestaoOrdemServicoService;

/**
 * 
 * Autor Michel A. Costa
 * email: michelifmtads@gmail.com
 */
@RestController
public class OrdemServicosController {
	
	// Metodo para inserir no bando de dados REST	
	@Autowired
	private GestaoOrdemServicoService gestaoOrdemServico;
	@PostMapping("/ordem-servico")
	@ResponseStatus
	public OrdemServico criar(@RequestBody @Validated OrdemServico ordemServico) {
		return gestaoOrdemServico.criar(ordemServico);
		
	}
	
	@GetMapping("/Hello")
	public String lista() {
		return  "HELLO Mundo!!!!! -> metordo: OrdemServiçoController()";
	}
}
