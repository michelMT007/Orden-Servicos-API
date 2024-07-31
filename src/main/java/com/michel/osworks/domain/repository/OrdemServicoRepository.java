package com.michel.osworks.domain.repository;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.michel.osworks.domain.model.Cliente;
import com.michel.osworks.domain.model.OrdemServico;
import com.michel.osworks.domain.model.StatusOrdemServico;

/**
 * 
 * Autor Michel A. Costa
 * email: michelifmtads@gmail.com
 */
@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long>{
	List<OrdemServico> findByStatus(String status);

	List<OrdemServico> findByStatus(StatusOrdemServico pendente);
}
