package com.michel.osworks.domain.service;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michel.osworks.domain.model.Comentario;
import com.michel.osworks.domain.exception.EntidadeNaoEncontradaException;
import com.michel.osworks.domain.exception.NegocioException;
import com.michel.osworks.domain.model.Cliente;
import com.michel.osworks.domain.model.OrdemServico;
import com.michel.osworks.domain.model.StatusOrdemServico;
import com.michel.osworks.domain.repository.ClienteRepository;
import com.michel.osworks.domain.repository.ComentarioRepository;
import com.michel.osworks.domain.repository.OrdemServicoRepository;

@Service
public class GestaoOrdemServicoService {

	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	  
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ComentarioRepository comentarioRepository;
	
	public OrdemServico criar(OrdemServico ordemServico) {
		Cliente cliente = clienteRepository.findById(ordemServico.getCliente().getId())
				.orElseThrow(() -> new NegocioException("Cliente não encontrado"));
		
		ordemServico.setCliente(cliente);
		ordemServico.setStatus(StatusOrdemServico.ABERTA);
		
		
		ordemServico.setDataAbertura(LocalDateTime.now());
		return ordemServicoRepository.save(ordemServico);
	}
	
//	public void finalizar(Long ordemServicoId) {
//		OrdemServico ordemServico = buscar(ordemServicoId);
//		
//		ordemServico.finalizar();
//		
//		ordemServicoRepository.save(ordemServico);
//	}
//	
//	public Comentario adicionarComentario(Long ordemServicoId, String descricao) {
//		OrdemServico ordemServico = buscar(ordemServicoId);
//		
//		Comentario comentario = new Comentario();
//		comentario.setDataEnvio(OffsetDateTime.now());
//		comentario.setDescricao(descricao);
//		comentario.setOrdemServico(ordemServico);
//		
//		return comentarioRepository.save(comentario);
//	}
//	
//	private OrdemServico buscar(Long ordemServicoId) {
//		return ordemServicoRepository.findById(ordemServicoId)
//				.orElseThrow(() -> new EntidadeNaoEncontradaException("Ordem de serviço não encontrada"));
//	}
	
}
