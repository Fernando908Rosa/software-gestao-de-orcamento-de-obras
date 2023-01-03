package com.orcamentodeobra.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.orcamentodeobra.dto.OrcamentoRequestDto;

@Entity
@Table(name = "tb_orcamento")
public class Orcamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String descricaodocliente;
	private String descricaodoprofisional;
	private BigDecimal valor;
	private Date datadeinicio;
	private Date datadetermino;
	private String observacaodocliente;
//	private Cliente cliente;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private Cliente cliente;

//
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_orcamento", referencedColumnName = "id")
//	private List<Contato> contato;
//
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_orcamento", referencedColumnName = "id")
//	private List<Material> material;

	public Orcamento() {
	}

	public Orcamento(OrcamentoRequestDto orcamento) {
		this.descricaodocliente = orcamento.getDescricaodocliente();
		this.descricaodoprofisional = orcamento.getDescricaodoprofisional();
		this.valor = orcamento.getValor();
		this.datadeinicio = orcamento.getDatadeinicio();
		this.datadetermino = orcamento.getDatadetermino();
		this.observacaodocliente = orcamento.getObservacaodocliente();
	}

	public Orcamento(String descricaodocliente, String descricaodoprofisional, BigDecimal valor,
			Date datadeinicio, Date datadetermino, String observacaodocliente, Cliente cliente) {
		super();
		this.descricaodocliente = descricaodocliente;
		this.descricaodoprofisional = descricaodoprofisional;
		this.valor = valor;
		this.datadeinicio = datadeinicio;
		this.datadetermino = datadetermino;
		this.observacaodocliente = observacaodocliente;
		this.cliente = cliente;
	}

	public Orcamento(String descricaodocliente, String descricaodoprofisional, BigDecimal valor, Date datadeinicio,
			Date datadetermino, String observacaodocliente) {
		super();
		this.descricaodocliente = descricaodocliente;
		this.descricaodoprofisional = descricaodoprofisional;
		this.valor = valor;
		this.datadeinicio = datadeinicio;
		this.datadetermino = datadetermino;
		this.observacaodocliente = observacaodocliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaodocliente() {
		return descricaodocliente;
	}

	public void setDescricaodocliente(String descricaodocliente) {
		this.descricaodocliente = descricaodocliente;
	}

	public String getDescricaodoprofisional() {
		return descricaodoprofisional;
	}

	public void setDescricaodoprofisional(String descricaodoprofisional) {
		this.descricaodoprofisional = descricaodoprofisional;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getDatadeinicio() {
		return datadeinicio;
	}

	public void setDatadeinicio(Date datadeinicio) {
		this.datadeinicio = datadeinicio;
	}

	public Date getDatadetermino() {
		return datadetermino;
	}

	public void setDatadetermino(Date datadetermino) {
		this.datadetermino = datadetermino;
	}

	public String getObservacaodocliente() {
		return observacaodocliente;
	}

	public void setObservacaodocliente(String observacaodocliente) {
		this.observacaodocliente = observacaodocliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}