package dominio;

import static util.Validador.validaCpf;

public class Cliente {
	protected int id;
	protected String nomeCorrentista;
	protected String cpfCorrentista;
	protected String nomeSocial;
	
	
	public Cliente(String nome, String cpf, String nomeSocial) {
		validaCpf(cpf);
		this.nomeCorrentista = nome;
		this.cpfCorrentista = cpf;
		this.nomeSocial = nomeSocial;
	}

	public String getNome() {
		return nomeCorrentista;
	}
	
	public String getNomeSocial() {
		return nomeSocial;
	}


	public String getCPF() {
		return cpfCorrentista;
	}


	public int getId() {
		return id;
	}


	public String getCpfCorrentista() {
		return cpfCorrentista;
	}


	public String getNomeCorrentista() {
		return nomeCorrentista;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setCpfCorrentista(String cpfCorrentista) {
		this.cpfCorrentista = cpfCorrentista;
	}


	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}


	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

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

