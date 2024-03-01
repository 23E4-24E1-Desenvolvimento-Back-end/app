package br.edu.infnet.elberthmoraes.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.elberthmoraes.model.domain.Escola;

@Service
public class EscolaService {

	private static Map<String, Escola> escolas = new HashMap<String, Escola>(); 
	
	public void incluir(Escola escola) {
		escolas.put(escola.getNome(), escola);
	}
	
	public void excluir(String nome) {
		escolas.remove(nome);
	}
	
	public Collection<Escola> obterLista(){
		return escolas.values();
	}
	
	public Escola obter(String nome){
		return escolas.get(nome);
	}
}