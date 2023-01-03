package com.orcamentodeobra.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Cliente;
import com.orcamentodeobra.entity.Orcamento;

public class OrcamentoResponseDto {

	@Column(name = "id")
	private Long id;

	@Column(name = "descricaodocliente")
	private String descricaodocliente;

	@Column(name = "descricaodoprofisional")
	private String descricaodoprofisional;

	@Column(name = "valor")
	private BigDecimal valor;

	@Column(name = "datadeinicio")
	private Date datadeinicio;

	@Column(name = "datadetermino")
	private Date datadetermino;

	@Column(name = "observacaodocliente")
	private String observacaodocliente;

	@Column(name = "idcliente")
	private Cliente idcliente;

//	@Column(name = "endereco")
//	private List<Endereco> endereco;
//
//	@Column(name = "contato")
//	private List<Contato> contato;
//
//	@Column(name = "material")
//	private List<Material> material;

	public static OrcamentoResponseDto converterOrcamentParaOrcamentoResponseDto(Orcamento orcamento) {
		return new OrcamentoResponseDto(orcamento.getId(), orcamento.getDescricaodocliente(),
				orcamento.getDescricaodoprofisional(), orcamento.getValor(), orcamento.getDatadeinicio(),
				orcamento.getDatadetermino(), orcamento.getObservacaodocliente(), orcamento.getCliente());

	}

	public OrcamentoResponseDto(Long id, String descricaodocliente, String descricaodoprofisional, BigDecimal valor,
			Date datadeinicio, Date datadetermino, String observacaodocliente, Cliente idcliente) {
		super();
		this.id = id;
		this.descricaodocliente = descricaodocliente;
		this.descricaodoprofisional = descricaodoprofisional;
		this.valor = valor;
		this.datadeinicio = datadeinicio;
		this.datadetermino = datadetermino;
		this.observacaodocliente = observacaodocliente;
		this.idcliente = idcliente;
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

	public Cliente getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Cliente idcliente) {
		this.idcliente = idcliente;
	}

}