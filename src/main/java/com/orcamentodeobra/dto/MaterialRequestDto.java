package com.orcamentodeobra.dto;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Material;

public class MaterialRequestDto {

	@Column(name = "descricaodomaterial")
	private String descricaodomaterial;

	@Column(name = "cimento")
	private String cimento;

	@Column(name = "tijolo")
	private String tijolo;

	@Column(name = "areia")
	private String areia;

	@Column(name = "brita")
	private String brita;

	@Column(name = "azuleijo")
	private String azuleijo;

	@Column(name = "cimentocola")
	private String cimentocola;

	@Column(name = "fio")
	private String fio;

	@Column(name = "cruzetinha")
	private String cruzetinha;

	@Column(name = "cano")
	private String cano;

	@Column(name = "cola")
	private String cola;

	@Column(name = "madeira")
	private String madeira;

	@Column(name = "forropvc")
	private String forropvc;

	@Column(name = "prego")
	private String prego;

	public MaterialRequestDto(String descricaodomaterial, String cimento, String tijolo, String areia, String brita,
			String azuleijo, String cimentocola, String fio, String cruzetinha, String cano, String cola,
			String madeira, String forropvc, String prego) {
		super();
		this.descricaodomaterial = descricaodomaterial;
		this.cimento = cimento;
		this.tijolo = tijolo;
		this.areia = areia;
		this.brita = brita;
		this.azuleijo = azuleijo;
		this.cimentocola = cimentocola;
		this.fio = fio;
		this.cruzetinha = cruzetinha;
		this.cano = cano;
		this.cola = cola;
		this.madeira = madeira;
		this.forropvc = forropvc;
		this.prego = prego;
	}

	public Material converterMaterialRequestDtoParaEntidadeMaterial() {
		return new Material(null, descricaodomaterial, cimento, tijolo, areia, brita, azuleijo, cimentocola, fio,
				cruzetinha, cano, cola, madeira, forropvc, prego);
	}

	public String getDescricaodomaterial() {
		return descricaodomaterial;
	}

	public void setDescricaodomaterial(String descricaodomaterial) {
		this.descricaodomaterial = descricaodomaterial;
	}

	public String getCimento() {
		return cimento;
	}

	public void setCimento(String cimento) {
		this.cimento = cimento;
	}

	public String getTijolo() {
		return tijolo;
	}

	public void setTijolo(String tijolo) {
		this.tijolo = tijolo;
	}

	public String getAreia() {
		return areia;
	}

	public void setAreia(String areia) {
		this.areia = areia;
	}

	public String getBrita() {
		return brita;
	}

	public void setBrita(String brita) {
		this.brita = brita;
	}

	public String getAzuleijo() {
		return azuleijo;
	}

	public void setAzuleijo(String azuleijo) {
		this.azuleijo = azuleijo;
	}

	public String getCimentocola() {
		return cimentocola;
	}

	public void setCimentocola(String cimentocola) {
		this.cimentocola = cimentocola;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getCruzetinha() {
		return cruzetinha;
	}

	public void setCruzetinha(String cruzetinha) {
		this.cruzetinha = cruzetinha;
	}

	public String getCano() {
		return cano;
	}

	public void setCano(String cano) {
		this.cano = cano;
	}

	public String getCola() {
		return cola;
	}

	public void setCola(String cola) {
		this.cola = cola;
	}

	public String getMadeira() {
		return madeira;
	}

	public void setMadeira(String madeira) {
		this.madeira = madeira;
	}

	public String getForropvc() {
		return forropvc;
	}

	public void setForropvc(String forropvc) {
		this.forropvc = forropvc;
	}

	public String getPrego() {
		return prego;
	}

	public void setPrego(String prego) {
		this.prego = prego;
	}

}
