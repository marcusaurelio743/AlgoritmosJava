package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	public static Connection getConexao() {
		try {
			final String stringConexao = "jdbc:postgresql://localhost:5433/javajdbc";
			final String usuario = "postgres";
			final String senha = "admin";
			Connection conexao = DriverManager.getConnection(stringConexao, usuario, senha);
			conexao.setAutoCommit(false);
			
			return conexao;
			
			
			
		}catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
	}

}
