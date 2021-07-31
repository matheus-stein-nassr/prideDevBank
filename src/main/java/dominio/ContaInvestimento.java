package dominio;

public class ContaInvestimento extends Conta{
	
	@Override
	public static void investir(float valorInvestido) {
		this.saldo += valorInvestido * 1.1;
	}
	
}
