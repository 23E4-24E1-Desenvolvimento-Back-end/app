package br.edu.infnet.elberthmoraes.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.elberthmoraes.model.domain.Escola;
import br.edu.infnet.elberthmoraes.model.service.EscolaService;

@RestController
@RequestMapping("/api/escola")
public class EscolaController {

	@Autowired
	private EscolaService escolaService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Escola escola) {
		escolaService.incluir(escola);
	}
	
	@DeleteMapping(value = "/{nome}/excluir")
	public void excluir(@PathVariable String nome) {
		escolaService.excluir(nome);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Escola> obterLista(){
		return escolaService.obterLista();
	}
	
	@GetMapping(value = "/{nome}/listar")
	public Escola obter(@PathVariable String nome){
		return escolaService.obter(nome);
	}	
}