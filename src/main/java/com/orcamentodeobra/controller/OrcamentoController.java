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

import com.orcamentodeobra.dto.OrcamentoRequestDto;
import com.orcamentodeobra.dto.OrcamentoResponseDto;
import com.orcamentodeobra.entity.Material;
import com.orcamentodeobra.entity.Orcamento;
import com.orcamentodeobra.service.MaterialService;
import com.orcamentodeobra.service.OrcamentoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class OrcamentoController {

	@Autowired
	private OrcamentoService orcamentoService;
	
	@Autowired
	private MaterialService materialService;

	@ApiOperation(value = "Listar Orcamento")
	@GetMapping("/orcamento")
	public List<OrcamentoResponseDto> getOrcamento() {
		return orcamentoService.listarOrcamento().stream()
				.map(orcamento -> OrcamentoResponseDto.converterOrcamentParaOrcamentoResponseDto(orcamento))
				.collect(Collectors.toList());

	}

	@ApiOperation(value = "Buscar Orcamento")
	@GetMapping("/orcamento/{id}")
	public ResponseEntity<OrcamentoResponseDto> buscarOrcamentoPorId(@PathVariable Long id) {
		Optional<Orcamento> orcamento = orcamentoService.buscarOrcamentoPorId(id);
		return orcamento.isPresent()
				? ResponseEntity.ok(OrcamentoResponseDto.converterOrcamentParaOrcamentoResponseDto(orcamento.get()))
				: ResponseEntity.notFound().build();

	}

	@ApiOperation(value = "Salvar Orcamento")
	@PostMapping("/orcamento/ {idCliente}/{id_Materiais}")
	public ResponseEntity<OrcamentoResponseDto> salvarOrcamento(@PathVariable Long idCliente, @PathVariable("id_Materiais") List<Long> idMateriais, @Valid @RequestBody OrcamentoRequestDto orcamentoDto) {
		List<Material> listamaterial = materialService.buscarListaMateriais(idMateriais);
		
		Orcamento orcamentoSalvo = orcamentoService
				.salvarOrcamento(orcamentoDto.converterOrcamentoRequestDtoParaEntidadeOrcamento(idCliente, listamaterial));
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(OrcamentoResponseDto.converterOrcamentParaOrcamentoResponseDto(orcamentoSalvo));

	}

	@ApiOperation(value = "Atualizar orcamento ")
	@PutMapping("/orcamento/{id}")
	public ResponseEntity<OrcamentoResponseDto> atualizarOrcamento(@PathVariable Long id,  @PathVariable Long idCliente, @PathVariable("id_Materiais") List<Long> idMateriais,
			@Valid @RequestBody OrcamentoRequestDto orcamentoDto) {
		List<Material> listaMaterial = materialService.buscarListaMateriais(idMateriais);
		Orcamento orcamentoAtualizado = orcamentoService.atualizarOrcamento(id,
				orcamentoDto.converterOrcamentoRequestDtoParaEntidadeOrcamento(idCliente, listaMaterial));
		return ResponseEntity.ok(OrcamentoResponseDto.converterOrcamentParaOrcamentoResponseDto(orcamentoAtualizado));
	}

	@ApiOperation(value = "Deletar Orcamento")
	@DeleteMapping("/orcamento/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(Long id) {
		orcamentoService.deletarOrcamento(id);

	}

}
