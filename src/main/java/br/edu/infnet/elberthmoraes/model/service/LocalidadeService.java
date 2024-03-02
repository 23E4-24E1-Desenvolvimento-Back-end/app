package br.edu.infnet.elberthmoraes.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.elberthmoraes.clients.IEnderecoClient;
import br.edu.infnet.elberthmoraes.clients.ILocalidadeClient;
import br.edu.infnet.elberthmoraes.model.domain.Distrito;
import br.edu.infnet.elberthmoraes.model.domain.Endereco;
import br.edu.infnet.elberthmoraes.model.domain.Estado;
import br.edu.infnet.elberthmoraes.model.domain.Municipio;

@Service
public class LocalidadeService {
	
	@Autowired
	private ILocalidadeClient localidadeClient;
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	@GetMapping(value = "/{cep}/json/")
	public Endereco obterPorCep(@PathVariable String cep) {
		return enderecoClient.obterPorCep(cep);
	}
	
	@GetMapping(value = "/estados?orderBy=nome")
	public Collection<Estado> obterEstados(){
		return localidadeClient.obterEstados();
	}

	@GetMapping(value = "/estados/{uf}/municipios")
	public Collection<Municipio> obterMunicipioPorUF(@PathVariable Integer uf){
		return localidadeClient.obterMunicipioPorUF(uf);
	}
	
	@GetMapping(value = "/municipios/{municipio}/distritos")
	public Collection<Distrito> obterDistritoPorMunicipio(@PathVariable Integer municipio){
		return localidadeClient.obterDistritoPorMunicipio(municipio);
	}
}
