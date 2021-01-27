package com.michel.osworks.domain.repository;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.michel.osworks.domain.model.OrdemServico;

/**
 * 
 * Autor Michel A. Costa
 * email: michelifmtads@gmail.com
 */
@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long>{

}
