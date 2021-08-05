package executavel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.ClienteDao;
import dao.ContaDao;
import dominio.Cliente;
import dominio.Conta;


public class TestaConexao {

	public static void main(String[] args) {
		try {
//		
//			Connection con = ConnectionFactory.getConnection();
//			
//			 Statement comando = con.createStatement();
//			  
//			 ResultSet resultado = comando.getResultSet();
//			 
//			 while(resultado.next()) {
//				 
//				 String numeroConta = resultado.getString("numeroConta");
//				 System.out.println( numeroConta);
//			 }
//	
//
//			 con.close();
			
			
			ContaDao contaDao = new ContaDao();
			
			ClienteDao clienteDao = new ClienteDao();
			
			Cliente cliente = new Cliente("Julia","95174826510","Caio");
			
			clienteDao.save(cliente);
			
			cliente = clienteDao.findByCPF("95174826510");
			
			System.out.println(cliente.getId() + " " + cliente.getNome() );
			
			
			Conta conta = new Conta("003","0006", cliente, 1000);
			contaDao.save(conta);
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
		
		
	/*	try {
			Connection con = DriverManager
					.getConnection("jdbc:mysql://18.208.75.123/stein?useSSL=false", "stein", "123trocar");
			
			Statement comando = con.createStatement();
			
			comando.execute("select * from cliente");
			 ResultSet resultSet = comando.getResultSet();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString("cpf"));
			}
			
		} catch (SQLException e){
			e.printStackTrace();
		}*/
		




