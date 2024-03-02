package br.edu.infnet.elberthmoraes.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.elberthmoraes.model.domain.Distrito;
import br.edu.infnet.elberthmoraes.model.domain.Estado;
import br.edu.infnet.elberthmoraes.model.domain.Municipio;

@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades", name = "localidadeClient")
public interface ILocalidadeClient {

	@GetMapping(value = "/estados?orderBy=nome")
	Collection<Estado> obterEstados();

	@GetMapping(value = "/estados/{uf}/municipios")
	Collection<Municipio> obterMunicipioPorUF(@PathVariable Integer uf);
	
	@GetMapping(value = "/municipios/{municipio}/distritos")
	Collection<Distrito> obterDistritoPorMunicipio(@PathVariable Integer municipio);
}