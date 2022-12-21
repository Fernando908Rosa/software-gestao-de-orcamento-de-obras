package com.orcamentodeobra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.orcamentodeobra.entity.Cidade;
import com.orcamentodeobra.repository.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;

	public List<Cidade> listarCidade() {
		return cidadeRepository.findAll();
	}

	public Optional<Cidade> buscarCidadePorId(Long id) {
		return cidadeRepository.findById(id);
	}

	public Cidade salvarCidade(Cidade cidade) {
		return cidadeRepository.save(cidade);
	}

	public Cidade atualizarCidade(Long Id, Cidade cidadeSalva) {
		Cidade cidadeVaiSerAtualizada = validarCidadeExistente(Id);
		BeanUtils.copyProperties(cidadeSalva, cidadeVaiSerAtualizada, "id");
		return cidadeRepository.save(cidadeVaiSerAtualizada);

	}

	public void deletarCidade(Long id) {
		cidadeRepository.deleteById(id);
	}

	private Cidade validarCidadeExistente(Long id) {
		Optional<Cidade> cidade = buscarCidadePorId(id);
		if (cidade.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		return cidade.get();

	}

}
