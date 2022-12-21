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

import com.orcamentodeobra.dto.CidadeRequestDto;
import com.orcamentodeobra.dto.CidadeResponseDto;
import com.orcamentodeobra.entity.Cidade;
import com.orcamentodeobra.service.CidadeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class CidadeController {

	@Autowired
	private CidadeService cidadeService;

	@ApiOperation(value = "Listar Cidade")
	@GetMapping("/cidade")
	public List<CidadeResponseDto> getCidade() {
		return cidadeService.listarCidade().stream()
				.map(cidade -> CidadeResponseDto.converterCidadeParaCidadeResponseDto(cidade))
				.collect(Collectors.toList());

	}

	@ApiOperation(value = "Buscar Cidade")
	@GetMapping("/cidade/{id}")
	public ResponseEntity<CidadeResponseDto> buscarCidadePorId(@PathVariable Long id) {
		Optional<Cidade> cidade = cidadeService.buscarCidadePorId(id);
		return cidade.isPresent()
				? ResponseEntity.ok(CidadeResponseDto.converterCidadeParaCidadeResponseDto(cidade.get()))
				: ResponseEntity.notFound().build();

	}

	@ApiOperation(value = "Salvar Cidade")
	@PostMapping("/cidade")
	public ResponseEntity<CidadeResponseDto> salvarCidade(@Valid @RequestBody CidadeRequestDto cidadeDto) {
		Cidade cidadeSalva = cidadeService.salvarCidade(cidadeDto.converterCidadeRequestDtoParaEntidadeCidade());
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CidadeResponseDto.converterCidadeParaCidadeResponseDto(cidadeSalva));

	}

	@ApiOperation(value = "Atualizar Cidade ")
	@PutMapping("/cidade/{id}")
	public ResponseEntity<CidadeResponseDto> atualizarCidade(@PathVariable Long id,
			@Valid @RequestBody CidadeRequestDto cidadeDto) {
		Cidade cidadeAtualizada = cidadeService.atualizarCidade(id,
				cidadeDto.converterCidadeRequestDtoParaEntidadeCidade());
		return ResponseEntity.ok(CidadeResponseDto.converterCidadeParaCidadeResponseDto(cidadeAtualizada));
	}

	@ApiOperation(value = "Deletar Cidade")
	@DeleteMapping("/cidade/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(Long id) {
		cidadeService.deletarCidade(id);

	}

}
