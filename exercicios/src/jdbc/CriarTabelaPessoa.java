package jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class CriarTabelaPessoa {

	public static void main(String[] args) throws Exception{
		
			Connection conexao = FabricaConexao.getConexao();
			String sql ="CREATE TABLE Pessoa (";
			sql+= " codigo SERIAL PRIMARY KEY,nome varchar(80) not null);";
			
			Statement statement = conexao.createStatement();
			
			statement.execute(sql);
			
			conexao.close();
	}

}
