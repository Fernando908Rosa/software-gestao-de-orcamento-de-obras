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

import com.orcamentodeobra.dto.ClienteRequestDto;
import com.orcamentodeobra.dto.ClienteResponseDto;
import com.orcamentodeobra.entity.Cliente;
import com.orcamentodeobra.service.ClienteService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@ApiOperation(value = "Listar Cliente")
	@GetMapping("/cliente")
	public List<ClienteResponseDto> getCliente() {
		return clienteService.listarCliente().stream()
				.map(cliente -> ClienteResponseDto.converterClienteParaResponseDto(cliente))
				.collect(Collectors.toList());

	}
	
	@ApiOperation(value = "Buscar Cliente")
	@GetMapping("/cliente/{id}")
	public ResponseEntity<ClienteResponseDto> buscarClientePorId(@PathVariable Long id) {
		Optional<Cliente> cliente = clienteService.buscarClientePorId(id);
		return cliente.isPresent()
				? ResponseEntity.ok(ClienteResponseDto.converterClienteParaResponseDto(cliente.get()))
				: ResponseEntity.notFound().build();

	}
	@ApiOperation(value = "Salvar Cliente")
	@PostMapping("/cliente")
	public ResponseEntity<ClienteResponseDto> salvarCliente(@Valid @RequestBody ClienteRequestDto clienteDto) {
		Cliente clienteSalvo = clienteService.salvarCliente(clienteDto.converterClienteRequestDtoParaEntidadeCliente());
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(ClienteResponseDto.converterClienteParaResponseDto(clienteSalvo));

	}
	@ApiOperation(value = "Atualizar Cliente ")
	@PutMapping("/cliente/{id}")
	public ResponseEntity<ClienteResponseDto> atualizarCliente(@PathVariable Long id,
			@Valid @RequestBody ClienteRequestDto clienteDto) {
		Cliente clienteAtualizado = clienteService.atualizarCliente(id,
				clienteDto.converterClienteRequestDtoParaEntidadeCliente());
		return ResponseEntity.ok(ClienteResponseDto.converterClienteParaResponseDto(clienteAtualizado));
	}
	
	@ApiOperation(value = "Deletar Cliente")
	@DeleteMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(Long id) {
		clienteService.deletarCliente(id);

	}

}
