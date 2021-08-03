package util;

public class Validador {
	
	public static void validaCpf(String cpf) {
		if(cpf.length() != 11 ) {
			throw new IllegalArgumentException("CPF Invalido");
		}
	}

}
