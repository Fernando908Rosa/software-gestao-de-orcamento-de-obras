package com.orcamentodeobra.dto;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Cidade;

public class CidadeResponseDto {

	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "uf")
	private Integer uf;

	@Column(name = "ibge")
	private Integer ibge;

	public CidadeResponseDto(Integer integer, String nome, Integer uf, Integer ibge) {
		super();
		this.id = integer;
		this.nome = nome;
		this.uf = uf;
		this.ibge = ibge;
	}

	public static CidadeResponseDto converterCidadeParaCidadeResponseDto(Cidade cidade) {
		return new CidadeResponseDto(cidade.getId(), cidade.getNome(), cidade.getUf(), cidade.getIbge());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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