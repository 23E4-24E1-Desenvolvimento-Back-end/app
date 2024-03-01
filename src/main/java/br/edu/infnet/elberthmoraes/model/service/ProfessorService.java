package br.edu.infnet.elberthmoraes.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.elberthmoraes.model.domain.Professor;

@Service
public class ProfessorService {

	private static Map<Integer, Professor> professores = new HashMap<Integer, Professor>(); 
	
	public void incluir(Professor professor) {
		professores.put(professor.getRegistro(), professor);
	}
	
	public void excluir(int registro) {
		professores.remove(registro);
	}
	
	public Collection<Professor> obterLista(){
		return professores.values();
	}
	
	public Professor obter(int registro){
		return professores.get(registro);
	}
}