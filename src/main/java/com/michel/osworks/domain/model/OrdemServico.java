package com.michel.osworks.domain.model;

import java.io.Serializable;
import java.math.BigDecimal; 
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.sun.istack.NotNull;



@Entity
public class  OrdemServico implements Serializable {
	/**
	 * 
	 */       
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne
	private Cliente cliente;
	
	@NotNull
	private String descricao;
	@NotNull
	private BigDecimal preco; 
	
	@JsonProperty(access = Access.READ_ONLY)
	@Enumerated(EnumType.STRING)
	private StatusOrdemServico status;
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime data_abertura;
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDateTime  data_finalizacao;
	
	public OrdemServico() {
		
	}

	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public BigDecimal getPreco() {
		return preco;
	}



	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}



	public StatusOrdemServico getStatus() {
		return status;
	}



	public void setStatus(StatusOrdemServico status) {
		this.status = status;
	}



	public LocalDateTime getData_abertura() {
		return data_abertura;
	}



	public void setDataAbertura(LocalDateTime data) {
		this.data_abertura = data;
	}



	public LocalDateTime getData_finalizacao() {
		return data_finalizacao;
	}



	public void setData_finalizacao(LocalDateTime data_finalizacao) {
		this.data_finalizacao = data_finalizacao;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemServico other = (OrdemServico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
