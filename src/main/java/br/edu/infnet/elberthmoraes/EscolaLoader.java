package br.edu.infnet.elberthmoraes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.elberthmoraes.clients.IEnderecoClient;
import br.edu.infnet.elberthmoraes.model.domain.Endereco;
import br.edu.infnet.elberthmoraes.model.domain.Escola;
import br.edu.infnet.elberthmoraes.model.service.EscolaService;

@Component
public class EscolaLoader implements ApplicationRunner {

	@Autowired
	private IEnderecoClient enderecoClient;
	@Autowired
	private EscolaService escolaService;
		
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Endereco enderecoInfnet = enderecoClient.obterPorCep("22241900");

		escolaService.incluir(new Escola("Infnet", "infnet@infnet", enderecoInfnet));

		escolaService.excluir("Infnet");

		escolaService.incluir(new Escola("Instituto Infnet", "instituto@infnet", enderecoInfnet));

		System.out.println(" - " + escolaService.obter("Instituto Infnet"));
				
		escolaService.incluir(new Escola("Computação do Infnet", "computacao@infnet", enderecoInfnet));

		System.out.println(" - " + escolaService.obterLista());
	}
}