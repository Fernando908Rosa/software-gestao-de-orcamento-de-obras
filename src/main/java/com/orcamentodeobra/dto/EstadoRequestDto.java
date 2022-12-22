package com.orcamentodeobra.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Cidade;
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

	@Column(name = "cidade")
	private List<CidadeRequestDto> cidade;

	public EstadoRequestDto(String nome, String uf, Integer ibge, Integer pais, String ddd,
			List<CidadeRequestDto> cidade) {
		super();
		this.nome = nome;
		this.uf = uf;
		this.ibge = ibge;
		this.pais = pais;
		this.ddd = ddd;
		this.cidade = cidade;
	}

	public Estado converterEstadoRequestDtoParaEntidadeEstado() {
		return new Estado(null, nome, uf, ibge, pais, ddd, retornacidades(cidade));

	}

	private List<Cidade> retornacidades(List<CidadeRequestDto> cidades) {
		List<Cidade> dtos = new ArrayList<Cidade>();
		for (CidadeRequestDto cidadedto : cidades) {
			Cidade dto = new Cidade(cidadedto);
			dtos.add(dto);

		}

		return dtos;
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