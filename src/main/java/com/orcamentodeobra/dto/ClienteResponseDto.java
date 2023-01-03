package com.orcamentodeobra.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.orcamentodeobra.entity.Cliente;
import com.orcamentodeobra.entity.Contato;
import com.orcamentodeobra.entity.Endereco;
import com.orcamentodeobra.enuns.Genero;

public class ClienteResponseDto {

	@Column(name = "id")
	private Long id;

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

	@Column(name = "endereco")
	private List<Endereco> endereco;

	@Column(name = "contato")
	private List<Contato> contato;

	@Column(name = "genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;

	public ClienteResponseDto(Long id, String nome, String sobrenome, Date datadenascimento, Integer cpf,
			String nomedopai, String nomedamae, List<Endereco> endereco, List<Contato> contato, Genero genero) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.datadenascimento = datadenascimento;
		this.cpf = cpf;
		this.nomedopai = nomedopai;
		this.nomedamae = nomedamae;
		this.endereco = endereco;
		this.contato = contato;
		this.genero = genero;
	}

	public static ClienteResponseDto converterClienteParaResponseDto(Cliente cliente) {
		return new ClienteResponseDto(cliente.getId(), cliente.getNome(), cliente.getSobrenome(),
				cliente.getDatanascimento(), cliente.getCpf(), cliente.getNomedopai(), cliente.getNomedamae(),
				cliente.getEndereco(), cliente.getContato(), cliente.getGenero());

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

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public List<Contato> getContato() {
		return contato;
	}

	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}