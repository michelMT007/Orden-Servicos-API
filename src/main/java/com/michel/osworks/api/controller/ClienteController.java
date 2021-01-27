package com.michel.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michel.osworks.domain.model.Cliente;
import com.michel.osworks.domain.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return  clienteRepository.findAll();
	}
	
	
	
	@GetMapping("/clientepornome")
	public List<Cliente> listarPorNome() {
		return  clienteRepository.findByNome("Talissa");
	}
	
}
