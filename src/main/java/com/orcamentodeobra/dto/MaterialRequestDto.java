package com.orcamentodeobra.dto;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Material;

public class MaterialRequestDto {

	@Column(name = "descricaodomaterial")
	private String descricaodomaterial;

	

	public Material converterMaterialRequestDtoParaEntidadeMaterial() {
		return new Material( descricaodomaterial);
	}

	public String getDescricaodomaterial() {
		return descricaodomaterial;
	}

	public void setDescricaodomaterial(String descricaodomaterial) {
		this.descricaodomaterial = descricaodomaterial;
	}

}
