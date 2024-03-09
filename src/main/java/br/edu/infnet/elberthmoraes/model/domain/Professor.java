package br.edu.infnet.elberthmoraes.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int registro;
	private String nome;
	private float salario;
	private boolean mestre;
	@Transient
	private Endereco endereco;
	
	public Professor() {
		this.setRegistro(123);
		this.setNome("Elberth Moraes");
		this.setSalario(999);
		this.setMestre(true);
		this.setEndereco(new Endereco("20010020", "Prof Rua São José", "Prof 4º andar", "Prof Centro", "Prof Rio de Janeiro", "UF"));
	}
	
	public Professor(int registro) {
		this();
		this.setRegistro(123);
	}
	
	public Professor(Endereco endereco) {
		this();
		this.setEndereco(endereco);
	}
	public float calcularSalario(){
		
		float salarioTotal = salario + (mestre ? 1250 : 750);
		
		return indicativoGratificacao() ? salarioTotal + 1000 : salarioTotal;
	}
	
	public boolean indicativoGratificacao() {
		return salario >= 5000 && mestre;
	}
	
	@Override
	public String toString() {
		return "Professor: " + id + " - " + registro + " - " + nome + " - " + salario + " - " + mestre + " - " + endereco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public boolean isMestre() {
		return mestre;
	}

	public void setMestre(boolean mestre) {
		this.mestre = mestre;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	
}