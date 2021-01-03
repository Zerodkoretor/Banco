package com.banco.banco.Controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.banco.Service.BancoService;
import com.banco.banco.model.ContaEntity;

@RestController
@RequestMapping("/banco")
public class BancoController {
	
	@Autowired
	BancoService service;
	
	
	@PostMapping
	public ResponseEntity<ContaEntity> criarConta(@Valid @RequestBody ContaEntity conta, HttpServletResponse response){
		
		ContaEntity _conta = service.criarConta(conta);
		response.setStatus(HttpServletResponse.SC_ACCEPTED);
		return new ResponseEntity<ContaEntity>(_conta, new HttpHeaders(), response.getStatus());
		
	}

}
