package com.springCRUD.model.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String nome;

	@NotBlank
	private String telefone;

	@NotBlank
	private String nascimento;

	private Date cadastro;

	private Date alteracao;

	public Pessoa() {

	}

	public Pessoa(@NotBlank String nome, @NotBlank String telefone, @NotBlank String nascimento,
			@NotBlank Date cadastro, @NotBlank Date alteracao) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.cadastro = cadastro;
		this.alteracao = alteracao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public Date getCadastro() {
		return cadastro;
	}

	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}

	public Date getAlteracao() {
		return alteracao;
	}

	public void setAlteracao(Date alteracao) {
		this.alteracao = alteracao;
	}

}
