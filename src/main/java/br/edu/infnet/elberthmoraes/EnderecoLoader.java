package br.edu.infnet.elberthmoraes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.elberthmoraes.clients.IEnderecoClient;
import br.edu.infnet.elberthmoraes.model.domain.Endereco;
import br.edu.infnet.elberthmoraes.model.service.EnderecoService;

@Component
public class EnderecoLoader implements ApplicationRunner {

	@Autowired
	private IEnderecoClient enderecoClient;
	@Autowired
	private EnderecoService enderecoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Endereco enderecoInfnet = enderecoClient.obterPorCep("22241900");

		enderecoService.incluir(enderecoInfnet);

		enderecoService.excluir("22241900");

		Endereco e1 = new Endereco();
		e1.setCep("12345678");
		e1.setLogradouro("logradouro");
		e1.setBairro("bairro");

		enderecoService.incluir(e1);

		System.out.println(" - " + enderecoService.obter("12345678"));

		enderecoService.incluir(enderecoInfnet);

		System.out.println(" - " + enderecoService.obterLista());
	}

}