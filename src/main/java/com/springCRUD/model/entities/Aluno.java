package com.springCRUD.model.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Aluno extends Pessoa {

	@Min(0)
	@Max(10)
	private double notaAluno;

	public Aluno() {

	}

	public Aluno(@NotBlank String nome, @NotBlank String telefone,
			@NotBlank String nascimento, @NotBlank Date cadastro,
			@NotBlank Date alteracao, @Min(0) @Max(10) double notaAluno) {
		super(nome, telefone, nascimento, cadastro, alteracao);
		this.notaAluno = notaAluno;
	}

	public double getNotaAluno() {
		return notaAluno;
	}

	public void setNotaAluno(double notaAluno) {
		this.notaAluno = notaAluno;
	}

}
