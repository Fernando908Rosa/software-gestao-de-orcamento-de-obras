package com.orcamentodeobra.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.orcamentodeobra.entity.Cliente;
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

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "email")
	private String email;

	@Column(name = "telefone")
	private String telefone;

	@Column(name = "genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;

	public Cliente converterClienteRequestDtoParaEntidadeCliente() {
		return new Cliente(null, nome, sobrenome, datadenascimento, cpf, nomedopai, nomedamae, endereco, email,
				telefone, genero);

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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
}