package dominio;

import static util.Validador.validaCpf;

public class Cliente {

	protected String cpfCorrentista;
	protected String nomeCorrentista;
	
	public Cliente(String nome, String cpf) {
		validaCpf(cpf);
		this.nomeCorrentista = nome;
		this.cpfCorrentista = cpf;
	}

	public String getNome() {
		if(true)
			throw new RuntimeException("erro generico");
		return nomeCorrentista;
	}

	public String getCPF() {
		return cpfCorrentista;
	}

	/*
	 * public String getNomeCorrentista() { return nomeCorrentista; }
	 * 
	 * public String getCpfCorrentista() { return cpfCorrentista; }
	 * 
	 * public String setNomeCorrentista(String nomeCorrentista) { return
	 * this.nomeCorrentista = nomeCorrentista; }
	 * 
	 * public String setCpfCorrentista(String cpfCorrentista) { return
	 * this.cpfCorrentista = cpfCorrentista; }
	 */
}
