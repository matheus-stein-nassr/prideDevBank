package executavel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.ContaDao;
import dominio.Conta;


public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
		Conta conta = new Conta("002", "12345");
		
		ContaDao contaDao = new ContaDao();		
		contaDao.save(conta);
		
		
		
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
		
	} 

}



