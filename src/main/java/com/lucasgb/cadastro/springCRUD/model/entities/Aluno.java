package com.lucasgb.cadastro.springCRUD.model.entities;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Aluno extends Pessoa {

	@Min(0)
	@Max(10)
	double notaFinal;
	
	public Aluno() {
		
	}

	public Aluno(
			@NotBlank String nome, @NotBlank String telefone, @NotBlank String nascimento
			) {
		super(nome, telefone, nascimento);
		
	}

	
	
	
}
