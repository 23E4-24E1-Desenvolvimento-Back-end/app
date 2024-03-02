package br.edu.infnet.elberthmoraes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.elberthmoraes.model.domain.Endereco;
import br.edu.infnet.elberthmoraes.model.domain.Escola;
import br.edu.infnet.elberthmoraes.model.service.EscolaService;
import br.edu.infnet.elberthmoraes.model.service.LocalidadeService;

@Component
public class EscolaLoader implements ApplicationRunner {

	@Autowired
	private LocalidadeService localidadeService;
	@Autowired
	private EscolaService escolaService;
		
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Endereco enderecoInfnet = localidadeService.obterPorCep("22241900");

		escolaService.incluir(new Escola("Infnet", "infnet@infnet", enderecoInfnet));

		escolaService.excluir("Infnet");

		escolaService.incluir(new Escola("Instituto Infnet", "instituto@infnet", enderecoInfnet));

		System.out.println(" - " + escolaService.obter("Instituto Infnet"));
				
		escolaService.incluir(new Escola("Computação do Infnet", "computacao@infnet", enderecoInfnet));

		System.out.println(" - " + escolaService.obterLista());
	}
}