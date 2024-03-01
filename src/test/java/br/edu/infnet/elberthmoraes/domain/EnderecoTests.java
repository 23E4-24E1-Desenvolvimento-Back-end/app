package br.edu.infnet.elberthmoraes.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.elberthmoraes.model.domain.Endereco;

@SpringBootTest
class EnderecoTests {
	
	private Endereco endereco;

	private final String CEP = "20010020";
	private final String LOGRADOURO = "Rua São José";
	private final String COMPLEMENTO = "4º andar";
	private final String BAIRRO = "Centro";
	private final String LOCALIDADE = "Rio de Janeiro";
	private final String UF = "RJ";

	@BeforeEach
	void setUp() {
		endereco = new Endereco();
		endereco.setCep(CEP);
		endereco.setLogradouro(LOGRADOURO);
		endereco.setComplemento(COMPLEMENTO);
		endereco.setBairro(BAIRRO);
		endereco.setLocalidade(LOCALIDADE);
		endereco.setUf(UF);
	}
	
	@Test
	void recuperarDados() {
		assertEquals(CEP, endereco.getCep());
		assertEquals(LOGRADOURO, endereco.getLogradouro());
		assertEquals(COMPLEMENTO, endereco.getComplemento());
		assertEquals(BAIRRO, endereco.getBairro());
		assertEquals(LOCALIDADE, endereco.getLocalidade());
		assertEquals(UF, endereco.getUf());
	}
}