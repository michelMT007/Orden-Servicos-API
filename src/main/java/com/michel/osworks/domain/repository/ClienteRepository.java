package com.michel.osworks.domain.repository;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.michel.osworks.domain.model.Cliente;
/**
 * 
 * Autor Michel A. Costa
 * email: michelifmtads@gmail.com
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	 List<Cliente> findByNome(String nome);
	 List<Cliente> findByEmail(String email);
}
