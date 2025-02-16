package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException  {
		final String stringConexao = "jdbc:postgresql://localhost:5433/postgres";
		final String usuario = "postgres";
		final String senha = "admin";
		
		Connection conexao = DriverManager.getConnection(stringConexao, usuario, senha);
		
		//Connection conexao = FabricaConexao.getConexao();
		
		Statement stms = conexao.createStatement();
		
		stms.execute("create database javajdbc2");
		
		System.out.println("Banco criado com sucesso!!!");
		conexao.close();
	}

}
