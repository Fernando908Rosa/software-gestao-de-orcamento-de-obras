package com.orcamentodeobra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.orcamentodeobra.entity.Orcamento;
import com.orcamentodeobra.repository.OrcamentoRepository;

@Service
public class OrcamentoService {

	@Autowired
	private OrcamentoRepository orcamentoRepository;

	public List<Orcamento> listarOrcamento() {
		return orcamentoRepository.findAll();
	}

	public Optional<Orcamento> buscarOrcamentoPorId(Long id) {
		return orcamentoRepository.findById(id);
	}

	public Orcamento salvarOrcamento(Orcamento orcamento) {
		return orcamentoRepository.save(orcamento);
	}

	public Orcamento atualizarOrcamento(Long Id, Orcamento orcamentoSalvo) {
		Orcamento orcamentoVaiSerAtualizado = validarOrcamentoExistente(Id);
		BeanUtils.copyProperties(orcamentoSalvo, orcamentoVaiSerAtualizado, "id");
		return orcamentoRepository.save(orcamentoVaiSerAtualizado);

	}

	public void deletarOrcamento(Long id) {
		orcamentoRepository.deleteById(id);
	}

	private Orcamento validarOrcamentoExistente(Long id) {
		Optional<Orcamento> orcamento = buscarOrcamentoPorId(id);
		if (orcamento.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		return orcamento.get();

	}

}
