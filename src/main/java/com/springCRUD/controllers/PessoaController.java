package com.springCRUD.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springCRUD.model.entities.Pessoa;
import com.springCRUD.model.repositories.PessoaRepository;

@Controller
public class PessoaController {

	@Autowired
	private PessoaRepository pr;
	
	@RequestMapping(value="/cadastro", method = RequestMethod.GET)
	public String form() {
		return "pessoa/formPessoa";
	}
	
	@RequestMapping(value="/cadastro", method = RequestMethod.POST)
	public String form(Pessoa pessoa) {
		
		pr.save(pessoa);
		return "redirect:/cadastro";
	}
	
	@RequestMapping("/lista")
	public ModelAndView listaPessoas() {
		ModelAndView mv = new ModelAndView("pessoa/listaPessoa");
		Iterable<Pessoa> pessoas = pr.findAll();
		
		mv.addObject("pessoas", pessoas);
		
		return mv;
	}
}
