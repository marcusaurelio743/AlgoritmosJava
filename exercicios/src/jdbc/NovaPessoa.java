package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
			System.out.println("Informe o nome");
			String nome = sc.nextLine();
			Connection conexao = FabricaConexao.getConexao();
			
			String sql = "INSERT INTO pessoa(nome) VALUES (?);";
			
			PreparedStatement statement = conexao.prepareStatement(sql);
			statement.setString(1, nome);
			statement.execute();
			conexao.commit();
			
			
			System.out.println("Pessoa incluida com sucesso!!!");
		
		sc.close();
	}

}
