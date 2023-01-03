package com.orcamentodeobra.dto;

import javax.persistence.Column;

import com.orcamentodeobra.entity.Material;

public class MaterialResponseDto {

	@Column(name = "id")
	private Long id;

	@Column(name = "descricaodomaterial")
	private String descricaodomaterial;

	public MaterialResponseDto(Long id, String descricaodomaterial) {
		super();
		this.id = id;
		this.descricaodomaterial = descricaodomaterial;
	}

	public static MaterialResponseDto converterMaterialParaMaterialResponseDto(Material material) {
		return new MaterialResponseDto(material.getId(), material.getDescricaodomaterial());
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
