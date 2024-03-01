package br.edu.infnet.elberthmoraes.model.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Escola {

	private String nome;
	private String email;
	private List<Professor> professores;
	private Endereco endereco;
	
	public Escola() {
		this.setNome("Instituto Infnet");
		this.setEmail("instituto@infnet.edu.br");
		this.setEndereco(new Endereco());
		this.setProfessores(new ArrayList<Professor>(Arrays.asList(new Professor())));
	}

	public Escola(String nome) {
		this();
		this.setNome(nome);
	}
	
	public Escola(String nome, String email) {
		this(nome);
		this.setEmail(email);
	}

	public Escola(String nome, String email, Endereco endereco) {
		this(nome, email);
		this.setEndereco(endereco);
	}

	@Override
	public String toString() {
		return "Escola: " + nome + " - " + email + " - " + endereco + " - " + professores;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}