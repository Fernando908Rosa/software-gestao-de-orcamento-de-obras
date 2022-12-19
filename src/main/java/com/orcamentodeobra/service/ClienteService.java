package com.orcamentodeobra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.orcamentodeobra.entity.Cliente;
import com.orcamentodeobra.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> listarCliente() {
		return clienteRepository.findAll();
	}

	public Optional<Cliente> buscarClientePorId(Long id) {
		return clienteRepository.findById(id);
	}

	public Cliente salvarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public Cliente atualizarCliente(Long Id, Cliente clienteSalvo) {
		Cliente clienteVaiSerAtualizado = validarClienteExistente(Id);
		BeanUtils.copyProperties(clienteSalvo, clienteVaiSerAtualizado, "id");
		return clienteRepository.save(clienteVaiSerAtualizado);

	}

	public void deletarCliente(Long id) {
		clienteRepository.deleteById(id);
	}

	private Cliente validarClienteExistente(Long id) {
		Optional<Cliente> cliente = buscarClientePorId(id);
		if (cliente.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		return cliente.get();

	}

}
