package br.edu.infnet.elberthmoraes.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.elberthmoraes.model.domain.Escola;
import br.edu.infnet.elberthmoraes.model.service.EscolaService;

@SpringBootTest
public class EscolaServiceTests {

	@Autowired
	private EscolaService escolaService;
	
	private Escola escola;
	
	private final String NOME = "Infnet";

	@BeforeEach
	void setUp() {
		escola = new Escola(NOME);
	}
	
	@Test
	void inclusao() {
		
		escolaService.incluir(escola);
		
		assertEquals(escola, escolaService.obter(NOME));
	}
	
	@Test
	void exclusao() {
		inclusao();
		
		escolaService.excluir(NOME);
		
		assertEquals(null, escolaService.obter(NOME));		
	}
	
	@Test
	void recuperacaoTotal() {
		inclusao();
		
		assertTrue(escolaService.obterLista().contains(escola));
	}
}
