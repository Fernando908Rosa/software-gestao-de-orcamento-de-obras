package com.orcamentodeobra.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.orcamentodeobra.dto.MaterialRequestDto;
import com.orcamentodeobra.dto.MaterialResponseDto;
import com.orcamentodeobra.entity.Material;
import com.orcamentodeobra.service.MaterialService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class MaterialController {

	@Autowired
	private MaterialService materialService;

	@ApiOperation(value = "Listar todo Material")
	@GetMapping("material")
	public List<MaterialResponseDto> getMaterial() {
		return materialService.listarMaterial().stream()
				.map(material -> MaterialResponseDto.converterMaterialParaMaterialResponseDto(material))
				.collect(Collectors.toList());
	}

	@ApiOperation(value = "Buscar Material")
	@GetMapping("/material/{id}")
	public ResponseEntity<MaterialResponseDto> buscarMaterialPorId(@PathVariable Long id) {
		Optional<Material> material = materialService.buscarMaterialPorId(id);
		return material.isPresent()
				? ResponseEntity.ok(MaterialResponseDto.converterMaterialParaMaterialResponseDto(material.get()))
				: ResponseEntity.notFound().build();
	}

	@ApiOperation(value = "Salvar Material")
	@PostMapping("/material")
	public ResponseEntity<MaterialResponseDto> salvarMaterial(@Valid @RequestBody MaterialRequestDto materialDto) {
		Material materialSalvo = materialService
				.salvarMaterial(materialDto.converterMaterialRequestDtoParaEntidadeMaterial());
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(MaterialResponseDto.converterMaterialParaMaterialResponseDto(materialSalvo));
	}

	@ApiOperation(value = "Atualizar Material")
	@PutMapping("/material/{id}")
	public ResponseEntity<MaterialResponseDto> atualizarMaterial(@PathVariable Long id,
			@Valid @RequestBody MaterialRequestDto materialDto) {
		Material materialAtualizado = materialService.atualizarMaterial(id,
				materialDto.converterMaterialRequestDtoParaEntidadeMaterial());
		return ResponseEntity.ok(MaterialResponseDto.converterMaterialParaMaterialResponseDto(materialAtualizado));

	}

	@ApiOperation(value = "Deletar Material")
	@DeleteMapping("/material/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(Long id) {
		materialService.deletarMaterial(id);
	}

}
