package com.orcamentodeobra.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.orcamentodeobra.dto.MaterialRequestDto;
import com.orcamentodeobra.entity.Material;
import com.orcamentodeobra.repository.MaterialRepository;

@Service
public class MaterialService {

	@Autowired
	private MaterialRepository materialRepository;

	public List<Material> listarMaterial() {
		return materialRepository.findAll();
	}

	public Optional<Material> buscarMaterialPorId(Long id) {
		return materialRepository.findById(id);
	}
	
	public List<Material> buscarListaMateriais(List<Long> idMateriais){
		return materialRepository.findAllById(idMateriais);
	}

	public List<Material> salvarMaterial(List<Material> material) {
		return materialRepository.saveAll(material);
	}

	public List<Material> listadematerial(List<MaterialRequestDto> materialDto) {
		ArrayList<Material> arrayMaterial = new ArrayList<Material>();

		for (MaterialRequestDto materialdto : materialDto) {

			arrayMaterial.add(new Material(materialdto));
		}
		return arrayMaterial;
	}

	public Material atualizarMaterial(Long Id, Material materialSalvo) {
		Material materialVaiSerAtualizado = validarMaterialExistente(Id);
		BeanUtils.copyProperties(materialSalvo, materialVaiSerAtualizado, "id");
		return materialRepository.save(materialVaiSerAtualizado);

	}

	public void deletarMaterial(Long id) {
		materialRepository.deleteById(id);
	}

	private Material validarMaterialExistente(Long id) {
		Optional<Material> material = buscarMaterialPorId(id);
		if (material.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		return material.get();

	}

}
