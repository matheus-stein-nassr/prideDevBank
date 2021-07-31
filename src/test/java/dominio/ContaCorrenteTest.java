package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {
	
	@BeforeEach
	void setup() {
		System.out.println("chamou este metodo");
	}
	
	@Test
	void deveSerpossivelSacarUtilizandoChequeEspecial() {
		// preparacao
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100);
		
		//execucao
		contaCorrente.sacar(101);
		
		//validacao
		assertTrue(contaCorrente.getSaldo() == -1);
	}
	
	@Test
	void deveDarErroQuandoTentarSacarAcimaDoChequeEspecialSomadoAoSaldo(){
		ContaCorrente contaCorrente = new ContaCorrente();
		
		Assertions.assertThrows(RuntimeException.class, ()-> contaCorrente.sacar(1000));
	}
	

}
