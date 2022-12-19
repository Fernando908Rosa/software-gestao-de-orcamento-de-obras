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
	private Long id;
	private String nome;
	private Integer uf;
	private Integer ibge;

	public Estado() {
	}

	public Estado(Long id, String nome, Integer uf, Integer ibge) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
		this.ibge = ibge;
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
