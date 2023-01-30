package com.orcamentodeobra.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Cliente;
import com.orcamentodeobra.entity.Material;
import com.orcamentodeobra.entity.Orcamento;

public class OrcamentoRequestDto {

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

	public Orcamento converterOrcamentoRequestDtoParaEntidadeOrcamento(Long idCliente, List<Material> listaMateriais) {
		return new Orcamento(null, descricaodocliente, descricaodoprofisional, valor, datadeinicio, datadetermino,
				observacaodocliente, new Cliente(idCliente), listaMateriais);
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

}
