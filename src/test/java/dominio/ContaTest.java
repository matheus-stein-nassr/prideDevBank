package dominio;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ContaTest {
	@Test
	void deveSerPossivelCriarUmaConta() {
		//prepara�ao
		//execu��o
		
		Conta conta = new Conta();
		//valida��o
		assertTrue(conta != null);
	}
	
	@Test
	void deveSerPossivelAdicionarUmaChavePix() {
		//prepara��o
		Conta conta = new Conta();
		//execuc�o
		conta.adicionarChavePix("anaalice.cd@gmail.com");
		//valida��o
		assertTrue(conta.getChavePix(0).equals("anaalice.cd@gmail.com"));
	}
	@Test
	void deveSerPossivelSacarQuandoTemosLimite() {
		//prepara�ao
		Conta conta = new Conta();
		conta.depositar(1000);
		//execu��o
		conta.sacar(200);
		
		//valida��o
		assertTrue(800 == conta.getSaldo() );
	}
	
}
