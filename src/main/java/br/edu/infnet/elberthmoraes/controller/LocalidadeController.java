package br.edu.infnet.elberthmoraes.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.elberthmoraes.model.domain.Distrito;
import br.edu.infnet.elberthmoraes.model.domain.Endereco;
import br.edu.infnet.elberthmoraes.model.domain.Estado;
import br.edu.infnet.elberthmoraes.model.domain.Municipio;
import br.edu.infnet.elberthmoraes.model.service.LocalidadeService;

@RestController
@RequestMapping("/api/localidade")
public class LocalidadeController {
	
	@Autowired
	private LocalidadeService localidadeService;

	@GetMapping(value = "/{cep}")
	public Endereco obterPorCep(@PathVariable String cep) {
		return localidadeService.obterPorCep(cep);
	}
	
	@GetMapping(value = "/estados")
	public Collection<Estado> obterEstados(){
		return localidadeService.obterEstados();
	}

	@GetMapping(value = "/{uf}/municipios")
	public Collection<Municipio> obterMunicipioPorUF(@PathVariable Integer uf){
		return localidadeService.obterMunicipioPorUF(uf);
	}
	
	@GetMapping(value = "/{municipio}/distritos")
	public Collection<Distrito> obterDistritoPorMunicipio(@PathVariable Integer municipio){
		return localidadeService.obterDistritoPorMunicipio(municipio);
	}
	
}
