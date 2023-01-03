package com.orcamentodeobra.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.orcamentodeobra.enuns.Genero;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String sobrenome;
	private Date datanascimento;
	private Integer cpf;
	private String nomedamae;
	private String nomedopai;
	private Genero genero;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
//	private List<Orcamento> orcamento;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private List<Contato> contato;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private List<Endereco> endereco;

	public Cliente(Long idCliente) {
	}

	public Cliente() {
		super();
	}

	public Cliente(Cliente cliente) {
		this.nome = cliente.getNome();
		this.sobrenome = cliente.getSobrenome();
		this.datanascimento = cliente.getDatanascimento();
		this.cpf = cliente.getCpf();
		this.nomedamae = cliente.getNomedamae();
		this.nomedopai = cliente.getNomedopai();
		this.genero = cliente.getGenero();
	}

	public Cliente(Long id, String nome, String sobrenome, Date datanascimento, Integer cpf, String nomedamae,
			String nomedopai, Genero genero, List<Contato> contato, List<Endereco> endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.datanascimento = datanascimento;
		this.cpf = cpf;
		this.nomedamae = nomedamae;
		this.nomedopai = nomedopai;
		this.genero = genero;
		this.contato = contato;
		this.endereco = endereco;
	}

	public Cliente(String nome, String sobrenome, Date datadenascimento, Integer cpf, String nomedopai,
			String nomedamae, Genero genero, List<Endereco> retornaEnderecos, List<Contato> retornacontatos) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.datanascimento = datadenascimento;
		this.cpf = cpf;
		this.nomedamae = nomedamae;
		this.nomedopai = nomedopai;
		this.genero = genero;
		this.contato = retornacontatos;
		this.endereco = retornaEnderecos;
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

	public Date getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNomedamae() {
		return nomedamae;
	}

	public void setNomedamae(String nomedamae) {
		this.nomedamae = nomedamae;
	}

	public String getNomedopai() {
		return nomedopai;
	}

	public void setNomedopai(String nomedopai) {
		this.nomedopai = nomedopai;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public List<Contato> getContato() {
		return contato;
	}

	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

}
