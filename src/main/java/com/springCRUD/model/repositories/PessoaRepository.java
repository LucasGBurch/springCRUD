package com.springCRUD.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.springCRUD.model.entities.Pessoa;

public interface PessoaRepository
		extends PagingAndSortingRepository<Pessoa, Integer> {

	public Iterable<Pessoa> findByNomeContainingIgnoreCase(String parteNome);
}	// Esse método funciona só ao declarar na interface por já existir na documentação do SpringBoot
	// Para mais métodos, dá pra consultar na documentação deles, que já implementaram os métodos.
	// Essa utilizada acima é similar à searchByNameLike(parteNome), por exemplo.
