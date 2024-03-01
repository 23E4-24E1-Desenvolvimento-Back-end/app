package br.edu.infnet.elberthmoraes.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.elberthmoraes.model.domain.Endereco;
import br.edu.infnet.elberthmoraes.model.domain.Professor;

@SpringBootTest
class ProfessorTests {
	
	private Professor professor;

	private final String NOME = "Elberth";
	private final int REGISTRO = 123;
	
	@BeforeEach
	void setUp() {
		professor = new Professor();
		professor.setNome(NOME);
		professor.setRegistro(REGISTRO);
		professor.setMestre(false);
		professor.setSalario(0);
		professor.setEndereco(new Endereco());
	}

	@Test
	void professorMestreSalarioMenor5000() {
		professor.setMestre(true);
		professor.setSalario(1000);

		assertEquals(2250, professor.calcularSalario());
	}
	
	@Test
	void professorMestreSalarioMaior5000() {
		professor.setMestre(true);
		professor.setSalario(6000);

		assertEquals(8250, professor.calcularSalario());
	}

	@Test
	void professorMestreSalarioIgual5000() {
		professor.setMestre(true);
		professor.setSalario(5000);

		assertEquals(7250, professor.calcularSalario());
	}

	@Test
	void professorNaoMestreSalarioMenor5000() {
//		professor.setMestre(false);
		professor.setSalario(1000);

		assertEquals(1750, professor.calcularSalario());
	}
	
	@Test
	void professorNaoMestreSalarioMaior5000() {
//		professor.setMestre(false);
		professor.setSalario(6000);

		assertEquals(6750, professor.calcularSalario());
	}

	@Test
	void professorNaoMestreSalarioIgual5000() {
//		professor.setMestre(false);
		professor.setSalario(5000);

		assertEquals(5750, professor.calcularSalario());
	}
	
	@Test
	void recuperarDados() {
		assertEquals(NOME, professor.getNome());
		assertEquals(REGISTRO, professor.getRegistro());
		assertEquals(false, professor.isMestre());
		assertEquals(0, professor.getSalario());
		assertEquals(new Endereco().getCep(), professor.getEndereco().getCep());
	}
}