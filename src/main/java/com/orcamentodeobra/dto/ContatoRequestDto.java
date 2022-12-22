package com.orcamentodeobra.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.orcamentodeobra.entity.Contato;
import com.orcamentodeobra.enuns.Tipodecontato;

public class ContatoRequestDto {

	@Column(name = "descricaodocontato")
	private String descricaodocontato;

	@Column(name = "Tipodecontato")
	@Enumerated(EnumType.STRING)
	private Tipodecontato tipodecontato;

	public Contato converterContatoRequestDtoParaEntidadeContato() {
		return new Contato(null, descricaodocontato, tipodecontato);

	}

	public String getDescricaodocontato() {
		return descricaodocontato;
	}

	public void setDescricaodocontato(String descricaodocontato) {
		this.descricaodocontato = descricaodocontato;
	}

	public Tipodecontato getTipodecontato() {
		return tipodecontato;
	}

	public void setTipodecontato(Tipodecontato tipodecontato) {
		this.tipodecontato = tipodecontato;
	}

}
