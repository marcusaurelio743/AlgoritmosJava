package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		final String stringConexao = "jdbc:postgresql://localhost:5433/javajdbc";
		final String usuario = "postgres";
		final String senha = "admin";
		
		Connection conexao = DriverManager.getConnection(stringConexao, usuario, senha);
		System.out.println("conexao realizada !!!!");
		conexao.close();
	}

}
