package com.orcamentodeobra.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.orcamentodeobra.dto.ContatoRequestDto;
import com.orcamentodeobra.enuns.Tipodecontato;

@Entity
@Table(name = "tb_contato")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String descricaodocontato;
	private Tipodecontato tipodecontato;

	public Contato(String descricaodotipodecontato, Tipodecontato tipodecontato) {
		super();
		this.descricaodocontato = descricaodotipodecontato;
		this.tipodecontato = tipodecontato;
	}

	public Contato() {
	}

	public Contato(List<ContatoRequestDto> contato, String descricaodocontato, Tipodecontato tipodecontato) {
		this.descricaodocontato = descricaodocontato;
		this.tipodecontato = tipodecontato;

	}

	public Contato(ContatoRequestDto contatodto) {
		this.descricaodocontato = contatodto.getDescricaodocontato();
		this.tipodecontato = contatodto.getTipodecontato();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaodotipodecontato() {
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
