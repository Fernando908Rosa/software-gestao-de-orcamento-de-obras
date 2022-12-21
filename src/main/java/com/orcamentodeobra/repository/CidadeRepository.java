package com.orcamentodeobra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orcamentodeobra.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
