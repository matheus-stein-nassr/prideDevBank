package dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.Validador;

public class ClienteTest {
	
	@Test
	void deveSerPossivelCriarClientePassandoValores() {
		Cliente cliente = new Cliente("Matheus","04656211125");
		
		
		String nomeCliente = cliente.getNome();
		String cpfCorrentista = cliente.getCPF();
		
		Assertions.assertEquals("Matheus",nomeCliente);
		Assertions.assertEquals("04656211125",cpfCorrentista);
		
	}

}