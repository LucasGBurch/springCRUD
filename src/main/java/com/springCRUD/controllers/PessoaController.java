package com.springCRUD.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PessoaController {

	@RequestMapping("/cadastro")
	public String form() {
		return "pessoa/formPessoa";
	}
}
