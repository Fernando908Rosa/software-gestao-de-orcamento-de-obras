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

import com.orcamentodeobra.dto.EstadoRequestDto;
import com.orcamentodeobra.dto.EstadoResponseDto;
import com.orcamentodeobra.entity.Estado;
import com.orcamentodeobra.service.EstadoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class EstadoController {

	@Autowired
	private EstadoService estadoService;

	@ApiOperation(value = "Listar todo Estado")
	@GetMapping("/estado")
	public List<EstadoResponseDto> getEstado() {
		return estadoService.listarEstado().stream()
				.map(estado -> EstadoResponseDto.converterEstadoParaEstadoResponseDto(estado))
				.collect(Collectors.toList());

	}

	@ApiOperation(value = "Buscar Estado")
	@GetMapping("/estado/{id}")
	public ResponseEntity<EstadoResponseDto> buscarEstadoPorId(@PathVariable Long id) {
		Optional<Estado> estado = estadoService.buscarEstadoPorId(id);
		return estado.isPresent()
				? ResponseEntity.ok(EstadoResponseDto.converterEstadoParaEstadoResponseDto(estado.get()))
				: ResponseEntity.notFound().build();

	}

	@ApiOperation(value = "Salvar Estado")
	@PostMapping("/estado")
	public ResponseEntity<EstadoResponseDto> salvarEstado(@Valid @RequestBody EstadoRequestDto estadoDto) {
		Estado estadoSalvo = estadoService.salvarEstado(estadoDto.converterEstadoRequestDtoParaEntidadeEstado());
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(EstadoResponseDto.converterEstadoParaEstadoResponseDto(estadoSalvo));

	}

	@ApiOperation(value = "Atualizar Estado ")
	@PutMapping("/estado/{id}")
	public ResponseEntity<EstadoResponseDto> atualizarEstado(@PathVariable Long id,
			@Valid @RequestBody EstadoRequestDto estadoDto) {
		Estado estadoAtualizado = estadoService.atualizarEstado(id,
				estadoDto.converterEstadoRequestDtoParaEntidadeEstado());
		return ResponseEntity.ok(EstadoResponseDto.converterEstadoParaEstadoResponseDto(estadoAtualizado));
	}

	@ApiOperation(value = "Deletar Estado")
	@DeleteMapping("/estado/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(Long id) {
		estadoService.deletarEstado(id);

	}

}
