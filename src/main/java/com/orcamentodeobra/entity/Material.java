package com.orcamentodeobra.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_material")
public class Material {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String descricaodomaterial;
	private String cimento;
	private String areia;
	private String brita;
	private String tijolo;
	private String azuleijo;
	private String cimentocola;
	private String fio;
	private String cruzetinha;
	private String cano;
	private String cola;
	private String madeira;
	private String forropvc;
	private String prego;

	public Material() {
	}

	

	public Material(Long id, String descricaodomaterial, String cimento, String areia, String brita, String tijolo,
			String azuleijo, String cimentocola, String fio, String cruzetinha, String cano, String cola,
			String madeira, String forropvc, String prego) {
		super();
		this.id = id;
		this.descricaodomaterial = descricaodomaterial;
		this.cimento = cimento;
		this.areia = areia;
		this.brita = brita;
		this.tijolo = tijolo;
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



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getTijolo() {
		return tijolo;
	}

	public void setTijolo(String tijolo) {
		this.tijolo = tijolo;
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
