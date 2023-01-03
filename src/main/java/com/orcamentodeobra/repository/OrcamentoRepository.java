package com.orcamentodeobra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orcamentodeobra.entity.Orcamento;

public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {

}
