package br.edu.infnet.elberthmoraes.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.elberthmoraes.model.domain.Professor;
import br.edu.infnet.elberthmoraes.model.service.ProfessorService;

@SpringBootTest
public class ProfessorServiceTests {

	@Autowired
	private ProfessorService professorService;
	
	private Professor professor;
	
	private final int REGISTRO = 123;

	@BeforeEach
	void setUp() {
		professor = new Professor(REGISTRO);
	}
	
	@Test
	void inclusao() {
		
		professorService.incluir(professor);
		
		assertEquals(professor, professorService.obter(REGISTRO));
	}
	
	@Test
	void exclusao() {
		inclusao();
		
		professorService.excluir(REGISTRO);
		
		assertEquals(null, professorService.obter(REGISTRO));		
	}
	
	@Test
	void recuperacaoTotal() {
		inclusao();
		
		assertTrue(professorService.obterLista().contains(professor));
	}
}
