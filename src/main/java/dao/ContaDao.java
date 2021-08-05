package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import dominio.Conta;
import factory.ConnectionFactory;

public class ContaDao {
	Connection conexao;
	
	public ContaDao() throws SQLException {
	  this.conexao = ConnectionFactory.conexao();
	}
	
	public void save(Conta conta) throws SQLException {
		Statement comando = conexao.createStatement();
		
		comando.execute(
				"insert into conta (numeroConta,numeroAgencia,saldo,id_cliente) values("
			    + "'" + conta.getNumeroConta() + "'" 
			    + ",'" + conta.getNumeroAgencia() +"'"
			    + ",'" + conta.getSaldo() + "'" 
			    + ",'" + conta.getCliente().getId()    + "'" 
			    		+ ");"
			);
	}

}
