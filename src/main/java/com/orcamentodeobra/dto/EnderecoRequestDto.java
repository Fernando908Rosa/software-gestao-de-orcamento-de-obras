package com.orcamentodeobra.dto;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Endereco;

public class EnderecoRequestDto {

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "nomedarua")
	private String nomedarua;

	@Column(name = "cep")
	private String cep;

	@Column(name = "numerodacasa")
	private String numerodacasa;

	public Endereco converterEnderecoRequestDtoParaEntidadeEndereco() {
		return new Endereco(null, bairro, nomedarua, cep, numerodacasa);
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
