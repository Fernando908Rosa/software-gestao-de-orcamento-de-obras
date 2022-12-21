package com.orcamentodeobra.dto;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Cidade;

public class CidadeRequestDto {

	@Column(name = "nome")
	private String nome;

	@Column(name = "uf")
	private Integer uf;

	@Column(name = "ibge")
	private Integer ibge;

	public Cidade converterCidadeRequestDtoParaEntidadeCidade() {
		return new Cidade(null, nome, uf, ibge);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getUf() {
		return uf;
	}

	public void setUf(Integer uf) {
		this.uf = uf;
	}

	public Integer getIbge() {
		return ibge;
	}

	public void setIbge(Integer ibge) {
		this.ibge = ibge;
	}
}	