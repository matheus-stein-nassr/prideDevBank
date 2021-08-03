package dominio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ContaInvestimentoTest {
	
	@Test
	void deveSerPossivelFazerUmInvestimento() {
		ContaInvestimento contaInvestimento = new ContaInvestimento();
		
		contaInvestimento.investir(500);
		Assertions.assertTrue(contaInvestimento.getSaldo() == 550);
	}

}
