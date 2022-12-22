package com.orcamentodeobra.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.orcamentodeobra.entity.Contato;
import com.orcamentodeobra.enuns.Tipodecontato;

public class ContatoResponseDto {

	@Column(name = "id")
	private Long id;

	@Column(name = "descricaodocontato")
	private String descricaodocontato;

	@Column(name = "tipodecontato")
	@Enumerated(EnumType.STRING)
	private Tipodecontato tipodecontato;

	public ContatoResponseDto(Long id, String descricaodocontato, Tipodecontato tipodecontato) {
		super();
		this.id = id;
		this.descricaodocontato = descricaodocontato;
		this.tipodecontato = tipodecontato;
	}

	public static ContatoResponseDto converterContatoParaResponseDto(Contato contato) {
		return new ContatoResponseDto(contato.getId(), contato.getDescricaodotipodecontato(),
				contato.getTipodecontato());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
