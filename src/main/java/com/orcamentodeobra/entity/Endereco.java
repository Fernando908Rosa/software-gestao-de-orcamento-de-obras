package com.orcamentodeobra.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.orcamentodeobra.dto.EnderecoRequestDto;

@Entity
@Table(name = "tb_endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String bairro;
	private String nomedarua;
	private String cep;
	private String numerodacasa;

	public Endereco(Long id, String bairro, String nomedarua, String cep, String numerodacasa) {
		super();
		this.id = id;
		this.bairro = bairro;
		this.nomedarua = nomedarua;
		this.cep = cep;
		this.numerodacasa = numerodacasa;
	}

	public Endereco() {
	}

	public Endereco(EnderecoRequestDto endereco) {
		this.bairro = endereco.getBairro();
		this.nomedarua = endereco.getNomedarua();
		this.cep = endereco.getCep();
		this.numerodacasa = endereco.getNumerodacasa();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNomedarua() {
		return nomedarua;
	}

	public void setNomedarua(String nomedarua) {
		this.nomedarua = nomedarua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumerodacasa() {
		return numerodacasa;
	}

	public void setNumerodacasa(String numerodacasa) {
		this.numerodacasa = numerodacasa;
	}

}
