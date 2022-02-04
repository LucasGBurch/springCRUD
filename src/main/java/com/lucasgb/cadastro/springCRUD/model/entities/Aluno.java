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

	public Aluno(@NotBlank String nome,
			@NotBlank String telefone,
			@NotBlank String nascimento,
			double notaFinal) {
		super(nome, telefone, nascimento);
		this.notaFinal = notaFinal;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

}
