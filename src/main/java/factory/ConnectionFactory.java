package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection conexao() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://18.208.75.123/stein?useSSL=false", "stein", "123trocar");
	}
}
