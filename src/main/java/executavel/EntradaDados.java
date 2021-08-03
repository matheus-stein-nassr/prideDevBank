package executavel;

import java.util.Scanner;

// import java.util.Scanner;

import dominio.Cliente;
import dominio.Conta;
import dominio.ContaCorrente;

public class EntradaDados {

	public static void main(String[] args) {
		String homensDaTv[] = { "Mel Gibson", "Deniro", "Fagundes", "Caio Castro", "Matheus Solano" };

		int i = 0;
		while (i < homensDaTv.length) {
			System.out.println(homensDaTv[i]);
			i++;
		}

		for (int contador = 0; contador < homensDaTv.length; contador++) {
			String inicial = homensDaTv[contador].substring(0, 1);
			if (inicial.equals("M")) {
				System.out.println(homensDaTv[contador]);
			}

		}

		/*
		 * for(String nome : homensDaTv) { System.out.println(nome); }
		 */

		Scanner entrada = new Scanner(System.in);
		String texto = "";

		while (!texto.equals("sair")) {
			System.out.println("Digite um texto:");
			texto = entrada.nextLine();
		}
	}

	/*
	 * public static void main(String[] args) { Conta conta = new ContaCorrente();
	 * conta.depositar(100);
	 * 
	 * try { Cliente cliente = new Cliente("matheus", "132");
	 * System.out.println(cliente.getNomeCorrentista()); } catch
	 * (IllegalArgumentException e) { System.out.println(e.getMessage()); }
	 * catch(Exception e) { System.out.println(e.getMessage()); } }
	 */

	/*
	 * public static void main(String[] args) { Scanner entrada = new
	 * Scanner(System.in); System.out.println("digite o valor a ser sacado:"); int
	 * valor = entrada.nextInt();
	 * 
	 * CaixaEletronico caixa = new CaixaEletronico();
	 * 
	 * caixa.retirar(valor); }
	 */

}
