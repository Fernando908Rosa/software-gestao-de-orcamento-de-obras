package com.orcamentodeobra.dto;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Estado;

public class EstadoResponseDto {

	@Column(name = "id")
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "uf")
	private Integer uf;

	@Column(name = "ibge")
	private Integer ibge;

	public EstadoResponseDto(Long id, String nome, Integer uf, Integer ibge) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
		this.ibge = ibge;
	}

	public static EstadoResponseDto converterEstadoParaEstadoResponseDto(Estado estado) {
		return new EstadoResponseDto(estado.getId(), estado.getNome(), estado.getUf(), estado.getIbge());

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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