package com.orcamentodeobra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orcamentodeobra.entity.Material;

public interface MaterialRepository extends JpaRepository<Material, Long> {

}
