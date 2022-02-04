package com.lucasgb.cadastro.springCRUD.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.lucasgb.cadastro.springCRUD.model.entities.Pessoa;

public interface PessoaRepository
	extends PagingAndSortingRepository<Pessoa, Integer> {

	public Iterable<Pessoa> findByNomeContainingIgnoreCase(String parteNome);
}
