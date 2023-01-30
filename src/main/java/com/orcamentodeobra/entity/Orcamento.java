package com.orcamentodeobra.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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

	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private Cliente cliente;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_orcamento", referencedColumnName = "id")
	private List<Material> material;

	public Orcamento() {
	}

	public Orcamento(Long id, String descricaodocliente, String descricaodoprofisional, BigDecimal valor,
			Date datadeinicio, Date datadetermino, String observacaodocliente, Cliente cliente,
			List<Material> material) {
		super();
		this.id = id;
		this.descricaodocliente = descricaodocliente;
		this.descricaodoprofisional = descricaodoprofisional;
		this.valor = valor;
		this.datadeinicio = datadeinicio;
		this.datadetermino = datadetermino;
		this.observacaodocliente = observacaodocliente;
		this.cliente = cliente;
		this.material = material;
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

	public List<Material> getMaterial() {
		return material;
	}

	public void setMaterial(List<Material> material) {
		this.material = material;
	}

}