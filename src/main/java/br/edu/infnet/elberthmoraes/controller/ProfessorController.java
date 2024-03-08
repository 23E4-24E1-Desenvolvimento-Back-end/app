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

import br.edu.infnet.elberthmoraes.model.domain.Professor;
import br.edu.infnet.elberthmoraes.model.service.ProfessorService;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {

	@Autowired
	private ProfessorService professorService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Professor professor) {
		professorService.incluir(professor);
	}
	
	@DeleteMapping(value = "/{registro}/excluir")
	public void excluir(@PathVariable int registro) {
		professorService.excluir(registro);
	}
	
	@GetMapping(value = "/listar")
	public Collection<Professor> obterLista(){
		return professorService.obterLista();
	}
	
	@GetMapping(value = "/{registro}/listar")
	public Professor obter(@PathVariable int registro){
		return professorService.obter(registro);
	}	
}