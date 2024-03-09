package br.edu.infnet.elberthmoraes.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;

	
	@Override
	public String toString() {

		return "Endereço: " + id + ";" + cep + ";" + logradouro + ";" + complemento + ";" + bairro + ";" + localidade + ";" + uf;
	}
	
	public Endereco() {
		this.setCep("20010020");
		this.setLogradouro("Rua São José");
		this.setComplemento("4º andar");
		this.setBairro("Centro");
		this.setLocalidade("Rio de Janeiro");
		this.setUf("RJ");
	}

	public Endereco(String cep) {
		this();
		this.cep = cep;
	}

	public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
		this(cep);
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
}