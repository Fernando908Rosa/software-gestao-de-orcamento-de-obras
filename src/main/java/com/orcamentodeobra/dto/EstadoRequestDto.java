package com.orcamentodeobra.dto;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Estado;

public class EstadoRequestDto {

	@Column(name = "nome")
	private String nome;

	@Column(name = "uf")
	private String uf;

	@Column(name = "ibge")
	private Integer ibge;

	@Column(name = "pais")
	private Integer pais;

	@Column(name = "ddd")
	private String ddd;

	public Estado converterEstadoRequestDtoParaEntidadeEstado() {
		return new Estado(null, nome, uf, ibge, pais, ddd);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public void setIbge(Integer ibge) {
		this.ibge = ibge;
	}

	public Integer getPais() {
		return pais;
	}

	public void setPais(Integer pais) {
		this.pais = pais;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
}	