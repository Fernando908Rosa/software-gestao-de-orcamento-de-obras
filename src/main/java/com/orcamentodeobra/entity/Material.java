package com.orcamentodeobra.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.orcamentodeobra.dto.MaterialRequestDto;

@Entity
@Table(name = "tb_material")
public class Material {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String descricaodomaterial;

	public Material() {
	}

	public Material(Long id, String descricaodomaterial) {
		super();
		this.id = id;
		this.descricaodomaterial = descricaodomaterial;
	}

	public Material(String descricaodomaterial) {
		this.descricaodomaterial = descricaodomaterial;
	
	}

	public Material(MaterialRequestDto material) {
		this.descricaodomaterial = material.getDescricaodomaterial();
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

}
