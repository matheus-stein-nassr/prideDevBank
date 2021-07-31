package executavel;

import dominio.Conta;

public class Teste {
	public static void main(String[] args) {
		Conta conta = new Conta();

		System.out.println("Nome do correntista: " + conta.getNomeCorrentista());
		System.out.println("CPF: " + conta.getCpfCorrentista());
		// System.out.println("chave pix: " + conta.getChavePix());
		// System.out.println("numero agencia: " + conta.getNumeroAgencia());
		System.out.println("Numero conta: " + conta.getNumeroConta());
		System.out.println("Tipo da conta: " + conta.getTipoConta());
		System.out.println("SALDO: " + conta.getSaldo());
		
		// conta.sacar(1455);
	}

}
