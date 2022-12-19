package com.orcamentodeobra.dto;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Endereco;

public class EnderecoResponseDto {

	@Column(name = "id")
	private Long id;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "nomedarua")
	private String nomedarua;

	@Column(name = "cep")
	private String cep;

	@Column(name = "numerodacasa")
	private String numerodacasa;

	public EnderecoResponseDto(Long id, String bairro, String nomedarua, String cep, String numerodacasa) {
		super();
		this.id = id;
		this.bairro = bairro;
		this.nomedarua = nomedarua;
		this.cep = cep;
		this.numerodacasa = numerodacasa;
	}

	public static EnderecoResponseDto converterEnderecoParaResponseDto(Endereco endereco) {
		return new EnderecoResponseDto(endereco.getId(), endereco.getBairro(), endereco.getNomedarua(),
				endereco.getCep(), endereco.getNumerodacasa());

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