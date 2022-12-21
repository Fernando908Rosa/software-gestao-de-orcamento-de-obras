package com.orcamentodeobra.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_estado")
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String uf;
	private Integer ibge;
	private Integer pais;
	private String ddd;

	public Estado() {
	}

	public Estado(Integer id, String nome, String uf, Integer ibge, Integer pais, String ddd) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
		this.ibge = ibge;
		this.pais = pais;
		this.ddd = ddd;
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