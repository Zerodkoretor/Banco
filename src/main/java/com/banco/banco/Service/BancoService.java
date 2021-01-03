package com.banco.banco.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.banco.model.ContaEntity;
import com.banco.banco.repository.ContaRepository;

@Service
public class BancoService {

	@Autowired
	ContaRepository repository;
	
	public ContaEntity criarConta(ContaEntity conta) {
		
		repository.save(conta);
		return conta;
		
	}
	
}
