package com.orcamentodeobra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.orcamentodeobra.entity.Estado;
import com.orcamentodeobra.repository.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;

	public List<Estado> listarEstado() {
		return estadoRepository.findAll();
	}

	public Optional<Estado> buscarEstadoPorId(Long id) {
		return estadoRepository.findById(id);
	}

	public Estado salvarEstado(Estado estado) {
		return estadoRepository.save(estado);
	}

	public Estado atualizarEstado(Long Id, Estado estadoSalvo) {
		Estado estadoVaiSerAtualizado = validarEstadoExistente(Id);
		BeanUtils.copyProperties(estadoSalvo, estadoVaiSerAtualizado, "id");
		return estadoRepository.save(estadoVaiSerAtualizado);

	}

	public void deletarEstado(Long id) {
		estadoRepository.deleteById(id);
	}

	private Estado validarEstadoExistente(Long id) {
		Optional<Estado> estado = buscarEstadoPorId(id);
		if (estado.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		return estado.get();

	}

}
