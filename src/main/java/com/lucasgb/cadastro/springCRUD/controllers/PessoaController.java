package com.lucasgb.cadastro.springCRUD.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lucasgb.cadastro.springCRUD.model.entities.Pessoa;
import com.lucasgb.cadastro.springCRUD.repositories.PessoaRepository;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

	@Autowired // Injeção de Dependência (DI)
	private PessoaRepository pessoaRepository; // Interface para executar CRUD

	@PostMapping(path = "/cadastro") // CREATE
	public @ResponseBody Pessoa cadastrarPessoa(@Valid Pessoa pessoa) {
		pessoaRepository.save(pessoa);
		return pessoa;
	}
}
