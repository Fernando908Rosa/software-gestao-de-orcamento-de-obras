package com.orcamentodeobra.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.orcamentodeobra.entity.Cliente;
import com.orcamentodeobra.entity.Contato;
import com.orcamentodeobra.enuns.Genero;

public class ClienteRequestDto {

	@Column(name = "nome")
	private String nome;

	@Column(name = "sobrenome")
	private String sobrenome;

	@Column(name = "datadenascimento")
	private Date datadenascimento;

	@Column(name = "cpf")
	private Integer cpf;

	@Column(name = "nomedopai")
	private String nomedopai;

	@Column(name = "nomedamae")
	private String nomedamae;

	@Column(name = "contato")
	private List<ContatoRequestDto> contato;

	@Column(name = "genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;

	public ClienteRequestDto(String nome, String sobrenome, Date datadenascimento, Integer cpf, String nomedopai,
			String nomedamae, List<ContatoRequestDto> contato, Genero genero) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.datadenascimento = datadenascimento;
		this.cpf = cpf;
		this.nomedopai = nomedopai;
		this.nomedamae = nomedamae;
		this.contato = contato;
		this.genero = genero;
	}

	public Cliente converterClienteRequestDtoParaEntidadeCliente() {
		return new Cliente(null, nome, sobrenome, datadenascimento, cpf, nomedopai, nomedamae, genero,
				retornacontatos(contato));

	}

	public List<Contato> retornacontatos(List<ContatoRequestDto> contatos) {
		List<Contato> dtos = new ArrayList<Contato>();
		for (ContatoRequestDto contatodto : contatos) {
			Contato dto = new Contato(contatodto);
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDatadenascimento() {
		return datadenascimento;
	}

	public void setDatadenascimento(Date datadenascimento) {
		this.datadenascimento = datadenascimento;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNomedopai() {
		return nomedopai;
	}

	public void setNomedopai(String nomedopai) {
		this.nomedopai = nomedopai;
	}

	public String getNomedamae() {
		return nomedamae;
	}

	public void setNomedamae(String nomedamae) {
		this.nomedamae = nomedamae;
	}

	public List<ContatoRequestDto> getContato() {
		return contato;
	}

	public void setContato(List<ContatoRequestDto> contato) {
		this.contato = contato;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}