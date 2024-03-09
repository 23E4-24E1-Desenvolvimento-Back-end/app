package br.edu.infnet.elberthmoraes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.elberthmoraes.model.domain.Professor;
import br.edu.infnet.elberthmoraes.model.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;
	
	public void incluir(Professor professor) {
		professorRepository.save(professor);
	}
	
	public void excluir(int registro) {
		//professores.remove(registro);
	}
	
	public Collection<Professor> obterLista(){
		return null;//professores.values();
	}
	
	public Professor obter(int registro){
		return null;//professores.get(registro);
	}
}