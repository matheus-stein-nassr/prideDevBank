package dominio;

public class Conta {
	protected int id;
	protected int id_cliente;
	String numeroConta;
	protected String numeroAgencia;
	protected float saldo;
	protected String tipoConta;
	protected Cliente cliente;
	protected String chavePix[] = new String[3]; 

	public Conta(String numeroConta, String numeroAgencia, Cliente cliente, float saldoInicial) {
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.cliente = cliente;
		this.saldo = saldoInicial;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public float getSaldo() {
		return saldo;

	}

	public String getChavePix(int pos) {
		return chavePix[pos];
	}

	public void adicionarChavePix(String novaChave) {

		if (chavePix[0] == null) {
			chavePix[0] = novaChave;
		} else {
			if (chavePix[1] == null) {
				chavePix[1] = novaChave;
			}else {
				chavePix[2] = novaChave;
			}
		}
	}

	public void depositar(float valorDepositado) {
		this.saldo += valorDepositado;
	}

	public void trasferir(float valorTransferencia, Conta contaDestino) {

		this.sacar(valorTransferencia);
		contaDestino.depositar(valorTransferencia);
	}

	public void sacar(float valorSaque) {
		this.saldo -= valorSaque; 

		
	}

}