package com.banco.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.banco.model.ContaEntity;

@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Long>{

}
