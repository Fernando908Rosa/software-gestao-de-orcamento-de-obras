package com.orcamentodeobra.dto;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Estado;

public class EstadoResponseDto {

	@Column(name = "id")
	private Integer id;

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

	public EstadoResponseDto(Integer id, String nome, String uf, Integer ibge, Integer pais, String ddd) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
		this.ibge = ibge;
		this.pais = pais;
		this.ddd = ddd;
	}

	public static EstadoResponseDto converterEstadoParaEstadoResponseDto(Estado estado) {
		return new EstadoResponseDto(estado.getId(), estado.getNome(), estado.getUf(), estado.getIbge(),
				estado.getPais(), estado.getDdd());

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